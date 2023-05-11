package wallet.api.rest.jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import wallet.api.rest.jdbc.model.Transaccion;


@Repository
public class TransaccionRepositoryImpl implements ITransaccionRepository{


	@Autowired
	private JdbcTemplate jdbcTemplate; //SE INYECTA EL TEMPLATE PARA ACCEDER A LAS QUERYS

	@Override
	public int create(Transaccion trans) {
		return jdbcTemplate.update("INSERT INTO transaccion (wallet_idwallet, estatusTransaccion_idestatusTransaccion, tipoTransaccion_idtipoTransaccion, referencia, monto, concepto,"
				+ "fecha, canal, adreesdestino) VALUES(?,?,?,?,?,?,?,?,?)",
				new Object[] { trans.getWallet_idwallet(), trans.getEstatusTransaccion_idestatusTransaccion(), trans.getIdtransaccion(), trans.getReferencia(), trans.getMonto(), trans.getConcepto(),
						trans.getFecha(), trans.getCanal(), trans.getAdreesdestino()});
	}

	@Override
	public int update(Transaccion trans) {
		return jdbcTemplate.update("UPDATE transaccion SET estatusTransaccion_idestatusTransaccion=? WHERE idtransaccion=?",
				new Object[] { trans.getEstatusTransaccion_idestatusTransaccion(), trans.getIdtransaccion()});
		
	}
		
	@Override
	public Transaccion findById(int idtransaccion) {
		try {
			Transaccion trans = jdbcTemplate.queryForObject("SELECT * FROM transaccion WHERE idtransaccion=?",
					BeanPropertyRowMapper.newInstance(Transaccion.class), idtransaccion);

			return trans;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}
	}

	@Override
	public int deleteById(int idtransaccion) {
		 return jdbcTemplate.update("DELETE FROM transaccion WHERE idtransaccion=?", idtransaccion);
	}

	@Override
	public List<Transaccion> findAll() {
		return jdbcTemplate.query("SELECT * from transaccion", BeanPropertyRowMapper.newInstance(Transaccion.class));
	}
	
	@Override
	public List<Transaccion> lastFive() {
		return jdbcTemplate.query("SELECT * from transaccion ORDER BY fecha DESC LIMIT 5", BeanPropertyRowMapper.newInstance(Transaccion.class));
	}


}
