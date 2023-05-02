package training.lab.javaee.jsp.servlet;

import java.io.IOException;
import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import training.lab.javaee.jsp.model.Empleado;
import training.lab.javaee.jsp.service.EmpleadoService;


/**
 * Servlet implementation class ListEmpleadoServlet
 */
@WebServlet("/lista")
public class ListEmpleadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListEmpleadoServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//CARACTERISTICAS DEL RESPONSE TEXT/HTML
		response.setContentType("text/html;charset=UTF-8");
		
		//INVOCAMOS EL METODO DE  EmpleadoService
        List<Empleado> empleados = EmpleadoService.fetchEmpleado();
        
      //empleados hace referencia a la variable que hay en LISTA.JSP, en el foreach
        request.setAttribute("empleados", empleados); //Establecer los atributos en el objeto Empleado 
        
		request.getRequestDispatcher("lista.jsp").forward(request, response);//Enviar la solicitud HTTP a la página JSP
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	

}
