package training.lab.spring.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import training.lab.spring.mvc.beans.Usuario;
import training.lab.spring.mvc.dao.UsuarioDao;


@Controller
public class UsuarioController {
	
	@Autowired  
    UsuarioDao userdao;//inyectará dao
      
    /*Muestra un formulario para ingresar datos, aquí "command" es un atributo de solicitud reservado
	  que se utiliza para mostrar datos de objetos en forma
     */  
    @RequestMapping("/userform")  
    public String showform(Model m){ 
    	m.addAttribute("command", new Usuario());
   	
    	return "userform"; 
    	
    }  
    
    
    /*Guarda el objeto en la base de datos. El @ModelAttribute pone datos de solicitud
	  en objeto modelo. Debe mencionar el método RequestMethod.POST
	  porque la solicitud predeterminada es GET*/  
    @RequestMapping(value="/saveuser",method = RequestMethod.POST)  
    public String save(@ModelAttribute("user") Usuario user){  
        userdao.save(user); 
        
        return "redirect:/viewuser";//se redirigirá al mapeo de solicitud de usuario 
    }  
    
    
    /* Proporciona una lista de usuarios en el objeto modelo. */  
    @RequestMapping("/viewuser")  
    public String viewuser(Model m){  
        List<Usuario> list=userdao.getUsers();  
        m.addAttribute("list",list);
        
        return "viewuser";  
    }  
    
    
    /* Muestra datos de objetos en formulario por el ID.  
     * The @PathVariable envia el id por URL como variable.*/  
    @RequestMapping(value="/edituser/{idusuario}")  
    public String edit(@PathVariable int idusuario, Model m){  
        Usuario user=userdao.getuserById(idusuario);  
        m.addAttribute("command",user);
        return "usereditform";  
    }  
    
    
    /* Actualizar el objeto por id. */  
    @RequestMapping(value="/editsaveuser",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("user") Usuario user){  
        userdao.update(user);  
        return "redirect:/viewuser";  
    }  
    
    
    /* Elimina el registro por el id y hace un redirect a la lista /viewemp */  
    @RequestMapping(value="/deleteuser/{idusuario}",method = RequestMethod.GET)  
    public String delete(@PathVariable int idusuario){  
        userdao.delete(idusuario);  
        return "redirect:/viewuser";  
    } 

}
