package training.lab.javaee.jsp.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmpleadoList {
	
	private List<Empleado> resultados;

	public List<Empleado> getResultados() {
		return resultados;
	}

	public void setResultados(List<Empleado> resultados) {
		this.resultados = resultados;
	}
	
	
}
