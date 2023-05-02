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
 * Servlet implementation class CreateServlet
 */
@WebServlet("/nuevo")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Constructor. 
     */
    public CreateServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * Retorna el CONTEXTO de la aplicacion o LA URL de acceso
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Esto devuelve el método getContextPath() : ").append(request.getContextPath());
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();  
        
		//Se obtienen los datos DEL USUARIO desde el formulario A TRAVES DE GETPARAMETER
        String nombre = request.getParameter("nombre");  
        String nombreUsuario = request.getParameter("nombreusuario"); 
        String dni = request.getParameter("dni");
        String email = request.getParameter("email");  
        String password = request.getParameter("password");
          
        //SE SETEAN LOS DATOS AL NUEVO USUARIO
        Usuario usuario=new Usuario();
        usuario.setNombre(nombre);
        usuario.setNombreUsuario(nombreUsuario);;
        usuario.setDni(dni);
        usuario.setEmail(email);
        usuario.setPassword(password);
         
        //Se llama a UsuarioDao al método save para crear al usuario        
        int status=UsuarioDao.save(usuario);  
        
        
        if(status>0){  
            out.print("<p>Registro creado con éxito!!!!!</p>");           
            //con el método getRequestDispatcher el servlet reenvía la solicitud del cliente a ....
            //otro recurso (archivo HTML) en el servidor,para incluya la respuesta.
            request.getRequestDispatcher("index.html").include(request, response);  
        }else{  
            out.println("Error! no se puede guardar el registro");  
        }  
          
        out.close();  
    }  
	

}

