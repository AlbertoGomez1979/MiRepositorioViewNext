package wallet.api.rest.jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import wallet.api.rest.jdbc.model.Wallet;


@Repository
public class WalletRepositoryImpl implements IWalletRepository{


	@Autowired
	private JdbcTemplate jdbcTemplate; //SE INYECTA EL TEMPLATE PARA ACCEDER A LAS QUERYS

	@Override
	public int create(Wallet wallet) {
		return jdbcTemplate.update("INSERT INTO wallet (moneda_idmoneda, usuario_idusuario, code, balance, address) VALUES(?,?,?,?,?)",
				new Object[] { wallet.getMoneda_idmoneda(), wallet.getUsuario_idusuario(), wallet.getCode(), wallet.getBalance(), wallet.getAddress() });
	}

	@Override
	public int update(Wallet wallet) {
		return jdbcTemplate.update("UPDATE wallet SET balance=?  WHERE idwallet=?",
				new Object[] { wallet.getBalance(), wallet.getIdWallet() });
	}

	@Override
	public Wallet findById(int idwallet) {
		try {
			Wallet wallet = jdbcTemplate.queryForObject("SELECT * FROM wallet WHERE idwallet=?",
					BeanPropertyRowMapper.newInstance(Wallet.class), idwallet);

			return wallet;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}
	}

	@Override
	public int deleteById(int idwallet) {
		 return jdbcTemplate.update("DELETE FROM wallet WHERE idwallet=?", idwallet);
	}

	@Override
	public List<Wallet> findAll() {
		return jdbcTemplate.query("SELECT * from wallet", BeanPropertyRowMapper.newInstance(Wallet.class));
	}

}
