package training.lab.crud.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import training.lab.crud.servlet.dao.UsuarioDao;
import training.lab.crud.servlet.model.Usuario;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/lista") 
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     * Constructor vacio
     */
    public ListServlet() {
    }
    
    
    /**
     * Método doGet
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
            throws ServletException, IOException { 
    
    //SETEAMOS EL ENCABEZADO DE LA PÁGINA
    response.setContentType("text/html");
    
    //La clase PrintWriter se utiliza para escribir caracteres en una secuencia de salida.
    //CON PRINTWRITER SE permite agregar tag de HTML para mostrar vistas(html) al llamar los servlets, SE VE EN LOS OUT.PRINT
    PrintWriter out=response.getWriter();  
    out.println("<a href='index.html'>Agregar nuevo usuario</a>");  
    out.println("<h1>Lista de Usuarios</h1>"); 
    
    //Se llama a UsuarioDao s su método getAllUsuarios para obtener todos los usuarios, lo guardamos en la variable list
    List<Usuario> list=UsuarioDao.getAllUsuarios();  
      
    //PINTAMOS UNA TABLA EN HTML
    out.print("<table border='1' width='100%'");  
    out.print("<tr><th>Id</th><th>Nombre</th><th>Nombre de usuario</th><th>Dni</th><th>Email</th><th>Password</th><th>Editar</th><th>Eliminar</th></tr>");
    
    //RECORREMOS EL ARRAY, LLAMADO list.
    for(Usuario e:list){ 
    	//SE VA CONSTRUYENDO LA TABLA EN HTML DE MANERA DINÁMICA.
     out.print("<tr><td>"+e.getIdUsuario()+"</td><td>"+e.getNombre()+"</td><td>"+e.getNombreUsuario()+"</td><td>"+e.getDni()+"</td><td>"+e.getEmail()+"</td><td>"+e.getPassword()
     	+"</td><td><a href='EditarServlet?idusuario="+e.getIdUsuario()+"'>Editar</a></td><td><a href='EliminarServlet?idusuario="+e.getIdUsuario()+"'>Eliminar</a></td></tr>");  
     	//EL NOMBRE DEL ID DEBE COINCIDIR CON EL DE LAS CLASES ACTUALIZAR Y EDITAR
    }
    
    out.print("</table>");  
      
    //CERRAMOS EL PRINTWRITER
    out.close();  
    }  

}

