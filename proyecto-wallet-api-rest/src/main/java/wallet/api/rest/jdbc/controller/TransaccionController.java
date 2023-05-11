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

import wallet.api.rest.jdbc.model.Transaccion;
import wallet.api.rest.jdbc.repository.ITransaccionRepository;


@RestController
@RequestMapping("/api")
public class TransaccionController {
	
	  @Autowired
	  ITransaccionRepository transaccionRepository;
	  
	  /**
	   * RECOGER TODAS LAS TRANSACCIONES
	   * @return
	   */
	  
	  @GetMapping("/transacciones")
	  public ResponseEntity<List<Transaccion>> getAllTransaccion() {
	    
		  try {
	    		    	
	      List<Transaccion> trans = new ArrayList<Transaccion>();
	      //Invoca el servicio findall del repositorio
	      transaccionRepository.findAll().forEach(trans::add);
	      
	      //Si viene vacío..
	      if (trans.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }

	      return new ResponseEntity<>(trans, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  
	  @GetMapping("/transacciones/lastfive")
	  public ResponseEntity<List<Transaccion>> lastFive() {
	    
		  try {
	    		    	
	      List<Transaccion> trans = new ArrayList<Transaccion>();
	      //Invoca el servicio findall del repositorio
	      transaccionRepository.lastFive().forEach(trans::add);
	      
	      //Si viene vacío..
	      if (trans.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }

	      return new ResponseEntity<>(trans, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  
	  
	  /**
	   * BUSQUEDA POR ID
	   * @param id
	   * @return
	   */
	  @GetMapping("/transaccion/{idtransaccion}")
	  public ResponseEntity<Transaccion> getTransaccionById(@PathVariable("idtransaccion") int id) {
		  Transaccion trans = transaccionRepository.findById(id);

	    if (trans != null) {
	      return new ResponseEntity<>(trans, HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	  
	  /**
	   * CREAR TRANSACCION
	   * @param trans
	   * @return
	   */
	  @PostMapping("/transaccion")
	  public ResponseEntity<String> createTransaccion(@RequestBody Transaccion trans) {
	    try {
	    	transaccionRepository.create(new Transaccion(trans.getWallet_idwallet(), trans.getEstatusTransaccion_idestatusTransaccion(), trans.getTipoTransaccion_idtipoTransaccion(), trans.getReferencia(), trans.getMonto(),
	    			trans.getConcepto(), trans.getFecha(), trans.getCanal(), trans.getAdreesdestino()));
	    	
	      return new ResponseEntity<>("Transaccion creada!!!!!.", HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  
	  
	  /**
	   * 
	   * @param id
	   * @param transaccion
	   * @return
	   */
	  @PutMapping("/transaccion/{idtransaccion}")
	  public ResponseEntity<String> updateTransaccion
	  (@PathVariable("idtransaccion") int idtransaccion, @RequestBody Transaccion trans) {
		 
		  Transaccion t = transaccionRepository.findById(idtransaccion);

	    if (t != null) {
	    	t.setIdtransaccion(idtransaccion);	    	
	    	t.setEstatusTransaccion_idestatusTransaccion(trans.getEstatusTransaccion_idestatusTransaccion());
	    	
	    	transaccionRepository.update(t);
	    	System.out.println(trans.getEstatusTransaccion_idestatusTransaccion());
	      return new ResponseEntity<>("transacción actualizada!!!!", HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>("No se encontro transaccion con id= " + idtransaccion, HttpStatus.NOT_FOUND);
	    }
	  }

	  /**
	   * 
	   * @param id
	   * @return
	   */
	  @DeleteMapping("/transaccion/{idtransaccion}")
	  public ResponseEntity<String> deleteTransaccion(@PathVariable("idtransaccion") int id) {
	   
		  try {
	      int result = transaccionRepository.deleteById(id);
	      if (result == 0) {
	        return new ResponseEntity<>("No se encontro transaccion con id=" + id, HttpStatus.OK);
	      }
	      return new ResponseEntity<>("transaccion eliminada!!!!", HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>("No se puede eliminar la transaccion.", HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
	
}
