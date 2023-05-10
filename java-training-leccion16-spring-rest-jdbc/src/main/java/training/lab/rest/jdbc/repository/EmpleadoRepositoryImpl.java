package training.lab.rest.jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import training.lab.rest.jdbc.model.Empleado;

@Repository
public class EmpleadoRepositoryImpl implements IEmpleadoRepository{


	@Autowired
	private JdbcTemplate jdbcTemplate; //SE INYECTA EL TEMPLATE PARA ACCEDER A LAS QUERYS

	@Override
	public int save(Empleado emp) {
		return jdbcTemplate.update("INSERT INTO empleado (nombre, apellido, departamento, salario, edad) VALUES(?,?,?,?,?)",
				new Object[] { emp.getNombre(), emp.getApellido(), emp.getDepartamento(), emp.getSalario(), emp.getEdad() });
	}

	@Override
	public int update(Empleado emp) {
		return jdbcTemplate.update("UPDATE empleado SET nombre=?, apellido=?, departamento=?, salario=?, edad=?  WHERE empleado_id=?",
				new Object[] { emp.getNombre(), emp.getApellido(), emp.getDepartamento(), emp.getSalario(), emp.getEdad(), emp.getEmpleado_id() });
	}

	@Override
	public Empleado findById(int id) {
		try {
			Empleado emp = jdbcTemplate.queryForObject("SELECT * FROM empleado WHERE empleado_id=?",
					BeanPropertyRowMapper.newInstance(Empleado.class), id);

			return emp;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}
	}

	@Override
	public int deleteById(int id) {
		 return jdbcTemplate.update("DELETE FROM empleado WHERE empleado_id=?", id);
	}

	@Override
	public List<Empleado> findAll() {
		return jdbcTemplate.query("SELECT * from empleado", BeanPropertyRowMapper.newInstance(Empleado.class));
	}

}
