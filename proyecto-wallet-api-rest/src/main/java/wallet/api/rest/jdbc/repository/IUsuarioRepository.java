package wallet.api.rest.jdbc.repository;

import java.util.List;

import wallet.api.rest.jdbc.model.Usuario;

public interface IUsuarioRepository {
	
	int create(Usuario user);
	
	int update(Usuario user);
	
	Usuario findById(int idusuario);
	
	int deleteById(int idusuario);
	
	List<Usuario> findAll();

}
