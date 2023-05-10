package training.lab.spring.mvc.controllers;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

import training.lab.spring.mvc.beans.Empleado;
import training.lab.spring.mvc.dao.EmpleadoDao;

@Controller  
public class EmpleadoController {  
    
	@Autowired  
    EmpleadoDao dao;//inyectará dao desde spring-servlet.xml  
      
    /*Muestra un formulario para ingresar datos, aquí "command" es un atributo de solicitud reservado
	  que se utiliza para mostrar datos de objetos en forma
     */  
    @RequestMapping("/empform")  
    public String showform(Model m){  
    	m.addAttribute("command", new Empleado());
    	return "empform"; 
    }  
    
    
    /*Guarda el objeto en la base de datos. El @ModelAttribute pone datos de solicitud
	  en objeto modelo. Debe mencionar el método RequestMethod.POST
	  porque la solicitud predeterminada es GET*/  
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public String save(@ModelAttribute("emp") Empleado emp){  
        dao.save(emp);  
        return "redirect:/viewemp";//se redirigirá al mapeo de solicitud viewemp  
    }  
    
    
    /* Proporciona una lista de empleados en el objeto modelo. */  
    @RequestMapping("/viewemp")  
    public String viewemp(Model m){  
        List<Empleado> list=dao.getEmployees();  
        m.addAttribute("list",list);
        return "viewemp";  
    }  
    
    
    /* Muestra datos de objetos en formulario por el ID.  
     * The @PathVariable envia el id por URL como variable.*/  
    @RequestMapping(value="/editemp/{empleado_id}")  
    public String edit(@PathVariable int empleado_id, Model m){  
        Empleado emp=dao.getEmpById(empleado_id);  
        m.addAttribute("command",emp);
        return "empeditform";  
    }  
    
    
    /* Actualizar el objeto por id. */  
    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("emp") Empleado emp){  
        dao.update(emp);  
        return "redirect:/viewemp";  
    }  
    
    
    /* Elimina el registro por el id y hace un redirect a la lista /viewemp */  
    @RequestMapping(value="/deleteemp/{empleado_id}",method = RequestMethod.GET)  
    public String delete(@PathVariable int empleado_id){  
        dao.delete(empleado_id);  
        return "redirect:/viewemp";  
    }  
    
    
}  