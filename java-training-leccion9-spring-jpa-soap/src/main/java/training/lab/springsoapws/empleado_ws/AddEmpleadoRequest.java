package training.lab.springsoapws.empleado_ws;

//
//This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
//See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//Any modifications to this file will be lost upon recompilation of the source schema. 
//Generated on: 2018.02.22 at 09:48:02 PM EST 
//


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
* <p>Java class for anonymous complex type.
* 
* <p>El siguiente fragmento de esquema especifica el contenido esperado dentro de esta clase.
* 
* <pre>
* &lt;complexType>
*   &lt;complexContent>
*     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
*       &lt;sequence>
*         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
*         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
*         &lt;element name="departamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
*       &lt;/sequence>
*     &lt;/restriction>
*   &lt;/complexContent>
* &lt;/complexType>
* </pre>
* 
* La anotaciÃ³n @XmlAccessorType se utiliza en aplicaciones de Spring que trabajan con objetos Java y XML. 
* Esta anotaciÃ³n se utiliza para indicar cÃ³mo los campos de una clase deben ser mapeados a elementos XML 
* durante la serializaciÃ³n y la deserializaciÃ³n de objetos.
* XmlAccessType.FIELD: indica que el mapeo de XML se aplica a todos los campos de la clase.
* @XmlType indica las propiedades de la clase
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
 "nombre",
 "apellido",
 "departamento"
})
@XmlRootElement(name = "addEmpleadoRequest") //@XmlRootElement indica el elemento root documentos XML para el request.
public class AddEmpleadoRequest {

 @XmlElement(required = true) //@XmlElement indicalos elementos que contiene
 protected String nombre;
 @XmlElement(required = true)
 protected String apellido;
 @XmlElement(required = true)
 protected String departamento;
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}
	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

 

}
