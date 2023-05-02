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
 * Servlet implementation class EditarServlet
 */
@WebServlet("/editar")
public class EditarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     * CONSTRUCTOR
     */
    public EditarServlet() {
    }

    /**
     * Método doGet
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
            throws ServletException, IOException { 
    	
         response.setContentType("text/html"); 
         //PREPARAMOS EL PRINTWRITER PARA PODER GENERAR HTML
         PrintWriter out = response.getWriter();  
         out.println("<h1>Actualizar Usuario</h1>"); 
        
         //SE OBTIENE EL ID DEL USUARIO Y SE GUARDA EN LA VARIABLE sid, EL PARAMETRO DEBE COINCIDIR CON EL PARAMETRO QUE SE LE PASA A EDITAR EL LISTSERVER
         String sid = request.getParameter("idusuario"); 
         
         //SE PASA A ENTERO PORQUE CON GETPARAMETER TRAE UN STRING, HAY QUE PARSEARLO A ENTERO.
         int id = Integer.parseInt(sid);  
         
        //Se llama a UsuarioDao al método UsuarioById para obtener los datos del usuario por el ID 
         Usuario e = UsuarioDao.getUsuarioById(id);  
           
         //SE PASAN POR PANTALLA ,EN HTML, LOS DATOS PARA EDITAR, DE AQUI PASA A ACTUALIZARSERVLET
         out.print("<form action='ActualizarServlet' method='post'>");  
         out.print("<table>");  
         out.print("<tr><td></td><td><input type='hidden' name='idusuario' value='"+ e.getIdUsuario() +"'/></td></tr>");  
         out.print("<tr><td>Nombre:</td><td><input type='text' name='nombre' value='"+e.getNombre()+"'/></td></tr>");  
         out.print("<tr><td>Nombre de usuario:</td><td><input type='text' name='nombreusuario' value='"+e.getNombreUsuario()+"'/></td></tr>");
         out.print("<tr><td>Dni:</td><td><input type='text' name='dni' value='"+e.getDni()+"'/></td></tr>");
         out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+e.getEmail()+"'/></td></tr>"); 
         out.print("<tr><td>Contraseña:</td><td><input type='text' name='password' value='"+e.getPassword()+"'/></td></tr>");
         
         //BOTON PARA GUARDAR
         out.print("<tr><td colspan='2'><input type='submit' value='Guardar '/></td></tr>");  
         out.print("</table>");  
         out.print("</form>");  
           
         out.close();  
     }  

}
