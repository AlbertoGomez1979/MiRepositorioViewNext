package training.lab.javaee.jsp.service;

import java.util.List;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import training.lab.javaee.jsp.model.Empleado;
import training.lab.javaee.jsp.model.EmpleadoList;

public class EmpleadoService {
	
	
	/**
	 * WEBTARGET ES UNA CLASE QUE SE UTILIZA PARA CONSTRUIR UNA SOLICITUD HTTP A UN RECURSO WEB ESPECIFICO
	 * SE PUEDE UTILIZAR ESTA CLASE WEBTARGET EN UN SERVLET JSP PARA CONECTARSE A UNA API REST Y REALIZAR OPERACIONES
	 * COMO GET, POST, PUT Y DELETE.
	 */
	
	private static WebTarget resource = ClientBuilder.newBuilder().build().target("https://mocki.io/v1/c2a4fffe-4b88-465c-8e56-47accba12e6d");//URL DEL SERVICIO EXTERNO
	
	//METODO PARA LISTAR LOS EMPLEADOS
	public static List<Empleado> fetchEmpleado(){
		
		//OBTENEMOS LOS RESULTADOS Y LO ESTABLECEMOS AL OBJETO EMPLEADOLIST
		EmpleadoList res = resource.request(MediaType.APPLICATION_JSON).get(EmpleadoList.class);
		
		//DEVOLVEMOS LOS RESULTADOS
		return res.getResultados();
	}

}
