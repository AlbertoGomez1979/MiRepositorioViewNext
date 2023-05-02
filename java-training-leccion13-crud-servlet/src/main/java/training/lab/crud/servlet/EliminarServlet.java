package training.lab.crud.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import training.lab.crud.servlet.dao.UsuarioDao;

/**
 * Servlet implementation class EliminarServlet
 */
@WebServlet("/eliminar")
public class EliminarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     * Constructor
     */
    public EliminarServlet() {
    }

    /**
     * Método doGet.
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
            throws ServletException, IOException { 
    	
    	//EL PARAMETRO TIENE QUE COINCIDIR CON EL PARAMETRO ID DE CUANDO SE VA CONSTRUYENDO LA TABLA
       String sid = request.getParameter("idusuario");  
       int id = Integer.parseInt(sid);
       
       //Se llama a UsuarioDao, al método delete para eliminar el registro del usuario por el ID
       UsuarioDao.delete(id);
       //se hace redirect a la lista
       response.sendRedirect("ListServlet");  
   }  

}
