package training.lab.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Admin
 *LOS SERVLET INTERACTUAN CON APLICACIONES WEB
 */
@WebServlet("/saludo")
public class TrainingServlet extends HttpServlet{
	
	//CONSTANTE DE LA VERSIÓN
	private static final long serialVersionUID = 1L;
	
	
	//CONSTRUCTOR 
	public TrainingServlet() {
		
	}
	/**
	 * SE RECIBE UNA SOLICITUD HTTP GET EN UNA APLICACION WEB, EL SERVIDOR INVOCA EL METODO DOGET DEL SERVLET CORRESPONDIENTE PARA PROCESAR LA SOLICITUD.
	 * ESTE MÉTODO ES PARTE DE LA CLASE HTTPSERVLET
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name").trim(); //OBTIENE EL PARAMETRO NAME, TRIM ELIMINA LOS ESPACIOS VACÍOS DE ESE PARAMETRO
		
		response.setContentType("text/html"); //ESTABLECE EL TIPO DE MENSAJE,EN ESTE CASO TIPO HTML
		
			PrintWriter out = response.getWriter(); //PRINTWRITER SE UTILIZA PARA ESCRIBIR TEXTO EN LA RESPONSE
			
			out.print("<h2>hola " + name + "</h2>");
			
			out.close();
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//SE LLAMA AL MÉTODO DOGET PARA INDICAR QUE LA FUNCIONALIDAD ESTA DISPONIBLE PARA AMBAS SOLICITUDES HTTP
		doGet(request, response);
		
	}



}
