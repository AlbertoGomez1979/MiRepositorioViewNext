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

import wallet.api.rest.jdbc.model.Usuario;
import wallet.api.rest.jdbc.repository.IUsuarioRepository;

@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	  @Autowired
	  IUsuarioRepository usuarioRepository;
	  
	  /**
	   * RECOGER TODOS LOS EMPLEADOS
	   * @return
	   */
	  
	  @GetMapping("/usuarios")
	  public ResponseEntity<List<Usuario>> getAllUsuarios() {
	    
		  try {
	    		    	
	      List<Usuario> usuarios = new ArrayList<Usuario>();
	      //Invoca el servicio findall del repositorio
	      usuarioRepository.findAll().forEach(usuarios::add);
	      
	      //Si viene vacío..
	      if (usuarios.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }

	      return new ResponseEntity<>(usuarios, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  
	  
	  /**
	   * BUSQUEDA POR ID
	   * @param id
	   * @return
	   */
	  @GetMapping("/usuarios/{idusuario}")
	  public ResponseEntity<Usuario> getUsuarioById(@PathVariable("idusuario") int id) {
		  Usuario usuario = usuarioRepository.findById(id);

	    if (usuario != null) {
	      return new ResponseEntity<>(usuario, HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	  
	  /**
	   * CREAR USUARIO
	   * @param usuario
	   * @return
	   */
	  @PostMapping("/usuarios")
	  public ResponseEntity<String> createUsuarios(@RequestBody Usuario usuario) {
	    try {
	    	usuarioRepository.create(new Usuario(usuario.getNombre(), usuario.getNombreusuario(), usuario.getDni(), usuario.getEmail(), usuario.getPassword_2(), usuario.getWallet()));
	      return new ResponseEntity<>("Usuario creado satisfactoriamente.", HttpStatus.CREATED);
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
	  @PutMapping("/usuarios/{idusuario}")
	  public ResponseEntity<String> updateEmpleado
	  (@PathVariable("idusuario") int id, @RequestBody Usuario usuario) {
		 
		  Usuario user = usuarioRepository.findById(id);

	    if (user != null) {
	    	user.setIdUsuario(id);
	    	user.setNombre(usuario.getNombre());
	    	user.setNombreusuario(usuario.getNombreusuario());
	    	user.setDni(usuario.getDni());
	    	user.setEmail(usuario.getEmail());
	    	user.setPassword_2(usuario.getPassword_2());

	    	usuarioRepository.update(user);
	      return new ResponseEntity<>("Usuario actualizado!!!!", HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>("No se encontro el usuario con id= " + id, HttpStatus.NOT_FOUND);
	    }
	  }

	  /**
	   * 
	   * @param id
	   * @return
	   */
	  @DeleteMapping("/usuarios/{idusuario}")
	  public ResponseEntity<String> deleteUsuario(@PathVariable("idusuario") int id) {
	   
		  try {
	      int result = usuarioRepository.deleteById(id);
	      if (result == 0) {
	        return new ResponseEntity<>("No se encontro el usuario con id=" + id, HttpStatus.OK);
	      }
	      return new ResponseEntity<>("Usuario eliminado!!!!", HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>("No se puede eliminar el usuario.", HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
	
}
