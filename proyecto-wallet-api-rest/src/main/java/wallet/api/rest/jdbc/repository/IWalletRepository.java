package wallet.api.rest.jdbc.repository;

import java.util.List;

import wallet.api.rest.jdbc.model.Wallet;


public interface IWalletRepository {
	
	int create(Wallet wallet);
	
	int update(Wallet wallet);
	
	Wallet findById(int idwallet);
	
	int deleteById(int idwallet);
	
	List<Wallet> findAll();

}
