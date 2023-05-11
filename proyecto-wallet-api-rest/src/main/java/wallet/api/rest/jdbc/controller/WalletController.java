package wallet.api.rest.jdbc.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wallet.api.rest.jdbc.model.Wallet;
import wallet.api.rest.jdbc.repository.IWalletRepository;

@RestController
@RequestMapping("/api")
public class WalletController {

	@Autowired
	IWalletRepository walletRepository;

	/**
	 * RECOGER TODAS LAS WALLETS
	 * 
	 * @return
	 */

	@GetMapping("/wallets")
	public ResponseEntity<List<Wallet>> getAllWallets() {

		try {

			List<Wallet> w = new ArrayList<Wallet>();
			// Invoca el servicio findall del repositorio
			walletRepository.findAll().forEach(w::add);

			// Si viene vacío..
			if (w.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(w, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * BUSQUEDA POR ID
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/wallet/{idwallet}")
	public ResponseEntity<Wallet> getWalletById(@PathVariable("idwallet") int id) {
		Wallet w = walletRepository.findById(id);

		if (w != null) {
			return new ResponseEntity<>(w, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	/**
	 * CREAR WALLET
	 * 
	 * @param wallet
	 * @return
	 */
	@PostMapping("/wallet")
	public ResponseEntity<String> createWallet(@RequestBody Wallet wallet) {
		try {
			walletRepository.create(new Wallet(wallet.getMoneda_idmoneda(), wallet.getUsuario_idusuario(), wallet.getCode(),
					wallet.getBalance(), wallet.getAddress()));
			return new ResponseEntity<>("Wallet creada!!!!!", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * 
	 * @param id
	 * @param usuario
	 * @return
	 */
	@PutMapping("/wallet/{idwallet}")
	public ResponseEntity<String> updateWallet(@PathVariable("idwallet") int id, @RequestBody Wallet wallet) {

		Wallet w = walletRepository.findById(id);

		if (w != null) {
			w.setIdWallet(id);
			w.setBalance(wallet.getBalance());
			
			walletRepository.update(w);
			return new ResponseEntity<>("Wallet actualizada!!!!", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("No se encontro la wallet con id= " + id, HttpStatus.NOT_FOUND);
		}
	}

			/** EL METODO DELETE NO ESTÁ IMPLEMENTADO 
			 * 
			 * @param id
			 * @return
			 *//*
				 * @DeleteMapping("/usuarios/{idusuario}") public ResponseEntity<String>
				 * deleteUsuario(@PathVariable("idusuario") int id) {
				 * 
				 * try { int result = usuarioRepository.deleteById(id); if (result == 0) {
				 * return new ResponseEntity<>("No se encontro el usuario con id=" + id,
				 * HttpStatus.OK); } return new ResponseEntity<>("Usuario eliminado!!!!",
				 * HttpStatus.OK); } catch (Exception e) { return new
				 * ResponseEntity<>("No se puede eliminar el usuario.",
				 * HttpStatus.INTERNAL_SERVER_ERROR); } }
				 */
	

}
