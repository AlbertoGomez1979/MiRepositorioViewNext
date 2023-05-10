package training.lab.spring.mvc.dao;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;

import training.lab.spring.mvc.beans.Empleado;  
  
public class EmpleadoDao {  
	
	/*JdbcTemplate se utiliza para simplificar el acceso a bases de datos relacionales utilizando 
	 * JDBC (Java Database Connectivity). Esta clase abstrae gran parte de la complejidad de JDBC 
	 * y proporciona una API simple y fácil de usar para ejecutar consultas SQL y realizar operaciones 
	 * CRUD en la base de datos.*/	
	JdbcTemplate template;  
  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  


	public int save(Empleado p){  
	    String sql="insert into empleado(nombre, apellido, departamento, salario, edad) values('"+p.getNombre()+"','"+p.getApellido()+"','"+p.getDepartamento()+"', "+p.getSalario()+","+p.getEdad()+")";  
	    return template.update(sql);  
	}  
	
	
	public int update(Empleado p){  
	    String sql="update empleado set nombre='"+p.getNombre()+"', apellido='"+p.getApellido()+"' , departamento='"+p.getDepartamento()+"',salario="+p.getSalario()+",edad="+p.getEdad()+" where empleado_id="+p.getEmpleado_id()+"";  
	    return template.update(sql);  
	}  
	
	
	public int delete(int id){  
	    String sql="delete from empleado where empleado_id="+id+"";  
	    return template.update(sql);  
	}  
	
	
	public Empleado getEmpById(int id){  
	    String sql="select * from empleado where empleado_id=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Empleado>(Empleado.class));  
	}  
	
	
	public List<Empleado> getEmployees(){  
	    return template.query("select * from empleado",new RowMapper<Empleado>(){  
	    	
	        public Empleado mapRow(ResultSet rs, int row) throws SQLException {  
	            Empleado e=new Empleado();  
	            e.setEmpleado_id(rs.getInt(1));  
	            e.setNombre(rs.getString(2));
	            e.setApellido(rs.getString(3));
	            e.setDepartamento(rs.getString(4));
	            e.setSalario(rs.getFloat(5));  
	            e.setEdad(rs.getInt(6));  
	            
	            return e;  
	       
	        }  
	    });  
}  
}  