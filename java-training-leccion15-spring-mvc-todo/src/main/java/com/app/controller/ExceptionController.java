package com.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	//CLASE QUE SE OCUPA DE LOS ERRORES QUE PUEDAN APARECER EN LA APLICACIÓN.
	
	private Log logger = LogFactory.getLog(ExceptionController.class);

	@ExceptionHandler(value = Exception.class)
	public String handleException(HttpServletRequest request, Exception ex) {
		logger.error("Request " + request.getRequestURL() + " Threw an Exception", ex);
		return "error";
	}

}
