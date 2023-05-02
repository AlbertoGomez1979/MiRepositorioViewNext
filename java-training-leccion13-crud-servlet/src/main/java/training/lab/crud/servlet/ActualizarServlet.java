package training.lab.crud.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import training.lab.crud.servlet.dao.UsuarioDao;
import training.lab.crud.servlet.model.Usuario;


/**
 * Servlet implementation DE EditarServlet
 */
@WebServlet("/actualizar")
public class ActualizarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * Constructor
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarServlet() {
    }

    /**
     * Método doPost
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
            throws ServletException, IOException {  
    	
    	
          response.setContentType("text/html");  
          PrintWriter out = response.getWriter();  
            
          //SE RECOGEN LOS PARAMETROS PARA ACTUALIZAR USUARIO, SE PONEN LOS CAMPOS QUE QUERAMOS QUE SE ACTUALICEN
          //EL NOMBRE DE LOS PARAMETROS CORRESPONDEN CON LOS INPUT QUE SE PASAN EN LA CLASE EDITARSERVLET
          String sid = request.getParameter("idusuario");  
          int id = Integer.parseInt(sid);  
          String nombre = request.getParameter("nombre");  
          String nombreUsuario= request.getParameter("nombreusuario");
          String dni = request.getParameter("dni");  
          String email = request.getParameter("email"); 
          String password = request.getParameter("password");
            
          //SE SETEAN LOS PARAMETROS
          Usuario e = new Usuario();  
          e.setIdUsuario(id);  
          e.setNombre(nombre); 
          e.setNombreUsuario(nombreUsuario);
          e.setDni(dni);  
          e.setEmail(email);
          e.setPassword(password);
          
        //Se llama a UsuarioDao al método update para actualizar los datos del usuario por el ID   
          int status=UsuarioDao.update(e);
          //SI EL ID ES MAYOR A 0, SE REDIRIGE A ListServlet, PARA LISTAR USUARIOS
          if(status>0){  
              response.sendRedirect("ListServlet"); //se hace redirect a la lista llamando al servlet 
          }else{  
              out.println("Lo siento!!! No se puede actualizar el registro");  
          }  
            
          //CERRAMOS LA ESCRITURA
          out.close();  
      }  

}
