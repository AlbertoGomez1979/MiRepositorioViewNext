package wallet.api.rest.jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import wallet.api.rest.jdbc.model.Usuario;

@Repository
public class UsuarioRepositoryImpl implements IUsuarioRepository{


	@Autowired
	private JdbcTemplate jdbcTemplate; //SE INYECTA EL TEMPLATE PARA ACCEDER A LAS QUERYS

	@Override
	public int create(Usuario user) {
		return jdbcTemplate.update("INSERT INTO usuario (nombre, nombreusuario, dni, email, password_2) VALUES(?,?,?,?,?)",
				new Object[] { user.getNombre(), user.getNombreusuario(), user.getDni(), user.getEmail(), user.getPassword_2() });
	}

	@Override
	public int update(Usuario user) {
		return jdbcTemplate.update("UPDATE usuario SET nombre=?, nombreusuario=?, dni=?, email=?, password_2=?  WHERE idusuario=?",
				new Object[] { user.getNombre(), user.getNombreusuario(), user.getDni(), user.getEmail(), user.getPassword_2(), user.getIdUsuario() });
	}

	@Override
	public Usuario findById(int idusuario) {
		try {
			Usuario user = jdbcTemplate.queryForObject("SELECT * FROM usuario WHERE idusuario=?",
					BeanPropertyRowMapper.newInstance(Usuario.class), idusuario);

			return user;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}
	}

	@Override
	public int deleteById(int idusuario) {
		 return jdbcTemplate.update("DELETE FROM usuario WHERE idusuario=?", idusuario);
	}

	@Override
	public List<Usuario> findAll() {
		return jdbcTemplate.query("SELECT * from usuario", BeanPropertyRowMapper.newInstance(Usuario.class));
	}

}
