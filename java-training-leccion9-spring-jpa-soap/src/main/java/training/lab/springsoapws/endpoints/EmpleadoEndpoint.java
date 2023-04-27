package training.lab.springsoapws.endpoints;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import training.lab.springsoapws.empleado_ws.AddEmpleadoRequest;
import training.lab.springsoapws.empleado_ws.AddEmpleadoResponse;
import training.lab.springsoapws.empleado_ws.EmpleadoInfo;
import training.lab.springsoapws.empleado_ws.DeleteEmpleadoRequest;
import training.lab.springsoapws.empleado_ws.DeleteEmpleadoResponse;
import training.lab.springsoapws.empleado_ws.GetAllEmpleadosResponse;
import training.lab.springsoapws.empleado_ws.GetEmpleadoByIdRequest;
import training.lab.springsoapws.empleado_ws.GetEmpleadoByIdResponse;
import training.lab.springsoapws.empleado_ws.ServiceStatus;
import training.lab.springsoapws.empleado_ws.UpdateEmpleadoRequest;
import training.lab.springsoapws.empleado_ws.UpdateEmpleadoResponse;
import training.lab.springsoapws.entity.Empleado;
import training.lab.springsoapws.service.IEmpleadoService;



/**
 * @author Alberto
 * La anotaciÃ³n @Endpoint se utiliza para marcar una clase como punto final (endpoint) de un servicio 
 * web SOAP
 *
 */
@Endpoint
public class EmpleadoEndpoint {
	private static final String NAMESPACE_URI = "http://training.lab/empleado-ws"; //definicion del espacio de nombre
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	//@PayloadRoot se utiliza para indicar que este mÃ©todo maneja solicitudes SOAP
	@PayloadRoot(namespace=NAMESPACE_URI, localPart="getEmpleadoByIdRequest")
	//@ResponsePayload se utiliza para indicar que el valor devuelto por este mÃ©todo 
	//se incluirÃ¡ en la respuesta SOAP
	@ResponsePayload
	public GetEmpleadoByIdResponse getEmpleado(@RequestPayload GetEmpleadoByIdRequest request) {
		GetEmpleadoByIdResponse response = new GetEmpleadoByIdResponse();
		EmpleadoInfo empleadoInfo = new EmpleadoInfo();
		BeanUtils.copyProperties(empleadoService.getEmpleadoById(request.getEmpleadoId()), empleadoInfo);
		response.setEmpleadoInfo(empleadoInfo);
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllEmpleadosRequest")
	@ResponsePayload
	public GetAllEmpleadosResponse getAllEmpleados() {
		GetAllEmpleadosResponse response = new GetAllEmpleadosResponse();
		List<EmpleadoInfo> empleadosInfoList = new ArrayList<>();
		List<Empleado> empleadosList = empleadoService.getAllEmpleados();
		for (int i = 0; i < empleadosList.size(); i++) {
		     EmpleadoInfo ob = new EmpleadoInfo();
		     BeanUtils.copyProperties(empleadosList.get(i), ob);
		     empleadosInfoList.add(ob);    
		}
		response.getEmpleadoInfo().addAll(empleadosInfoList);
		return response;
	}	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "addEmpleadoRequest")
	@ResponsePayload
	public AddEmpleadoResponse addEmpleado(@RequestPayload AddEmpleadoRequest request) {
		AddEmpleadoResponse response = new AddEmpleadoResponse();		
    	        ServiceStatus serviceStatus = new ServiceStatus();		
		Empleado empleado = new Empleado();
		empleado.setNombre(request.getNombre());
		empleado.setApellido(request.getApellido());
		empleado.setDepartamento(request.getDepartamento());
                boolean flag = empleadoService.addEmpleado(empleado);
                if (flag == false) {
        	   serviceStatus.setStatusCode("CONFLICT");
        	   serviceStatus.setMessage("Empleado disponible");
        	   response.setServiceStatus(serviceStatus);
                } else {
		   EmpleadoInfo empleadoInfo = new EmpleadoInfo();
	           BeanUtils.copyProperties(empleado, empleadoInfo);
		   response.setEmpleadoInfo(empleadoInfo);
        	   serviceStatus.setStatusCode("SUCCESS");
        	   serviceStatus.setMessage("Empleado agregado con éxito");
        	   response.setServiceStatus(serviceStatus);
                }
                return response;
	}
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateEmpleadoRequest")
	@ResponsePayload
	public UpdateEmpleadoResponse updateEmpleado(@RequestPayload UpdateEmpleadoRequest request) {
		Empleado empleado = new Empleado();
		BeanUtils.copyProperties(request.getEmpleadoInfo(), empleado);
		empleadoService.updateEmpleado(empleado);
    	        ServiceStatus serviceStatus = new ServiceStatus();
    	        serviceStatus.setStatusCode("SUCCESS");
    	        serviceStatus.setMessage("Empleado Actualizado con éxito");
    	        UpdateEmpleadoResponse response = new UpdateEmpleadoResponse();
    	        response.setServiceStatus(serviceStatus);
    	        return response;
	}
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteEmpleadoRequest")
	@ResponsePayload
	public DeleteEmpleadoResponse deleteEmpleado(@RequestPayload DeleteEmpleadoRequest request) {
		Empleado empleado = empleadoService.getEmpleadoById(request.getEmpleadoId());
    	        ServiceStatus serviceStatus = new ServiceStatus();
		if (empleado == null ) {
	    	    serviceStatus.setStatusCode("FAIL");
	    	    serviceStatus.setMessage("Empleado no disponible");
		} else {
			empleadoService.deleteEmpleado(empleado);
	    	    serviceStatus.setStatusCode("SUCCESS");
	    	    serviceStatus.setMessage("Empleado eliminado con éxito");
		}
    	        DeleteEmpleadoResponse response = new DeleteEmpleadoResponse();
    	        response.setServiceStatus(serviceStatus);
		return response;
	}
	

}
