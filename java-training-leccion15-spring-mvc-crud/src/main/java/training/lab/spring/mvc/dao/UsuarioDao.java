package training.lab.spring.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import training.lab.spring.mvc.beans.Usuario;



public class UsuarioDao {
	
	
	/*JdbcTemplate se utiliza para simplificar el acceso a bases de datos relacionales utilizando 
	 * JDBC (Java Database Connectivity). Esta clase abstrae gran parte de la complejidad de JDBC 
	 * y proporciona una API simple y fácil de usar para ejecutar consultas SQL y realizar operaciones 
	 * CRUD en la base de datos.*/	
	JdbcTemplate template;  
  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  


	public int save(Usuario u){  
	    String sql="insert into usuario(nombre, nombreusuario, dni, email, password_2) values('"+u.getNombre()+"', '"+u.getDni()+"','"+u.getPassword_2()+"','"+u.getEmail()+"', '"+u.getNombreusuario()+"')";  
	    return template.update(sql);  
	}  
	
	
	public int update(Usuario u){  
	    String sql="update usuario set nombre='"+u.getNombre()+"', nombreusuario='"+u.getNombreusuario()+"',dni='"+u.getDni()+"',email='"+u.getEmail()+"',password_2= '"+u.getPassword_2()+"' where idusuario="+u.getIdusuario()+"";  
	    return template.update(sql);  
	}  
	
	
	public int delete(int idUsuario){  
	    String sql="delete from usuario where idusuario="+idUsuario+"";  
	    return template.update(sql);  
	}  
	
	
	public Usuario getuserById(int idUsuario){  
	    String sql="select * from usuario where idusuario=?";  
	    return template.queryForObject(sql, new Object[]{idUsuario},new BeanPropertyRowMapper<Usuario>(Usuario.class));  
	}  
	
	
	public List<Usuario> getUsers(){  
	    return template.query("select * from usuario",new RowMapper<Usuario>(){  
	    	
	        public Usuario mapRow(ResultSet rs, int row) throws SQLException {  
	            Usuario u = new Usuario();  
	            
	            //SETEAMOS LOS VALORES DE USUARIO
	            u.setIdusuario(rs.getInt(1));
	            u.setNombre(rs.getString(2));
	            u.setNombreusuario(rs.getString(3));
	            u.setDni(rs.getString(4));
	            u.setEmail(rs.getString(5));
	            u.setPassword_2(rs.getString(6));
	            
	            return u;  
	       
	        }  
	    });  
} 

}
