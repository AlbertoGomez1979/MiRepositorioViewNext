package wallet.api.rest.jdbc.repository;

import java.util.List;

import wallet.api.rest.jdbc.model.Transaccion;


public interface ITransaccionRepository {
	
	int create(Transaccion trans);
	
	int update(Transaccion trans);
	
	Transaccion findById(int idtransaccion);
	
	int deleteById(int idtransaccion);
	
	List<Transaccion> findAll();

	List<Transaccion> lastFive();

}
