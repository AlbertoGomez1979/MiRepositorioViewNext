package training.lab.springsoapws.empleado_ws;

//
//This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
//See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//Any modifications to this file will be lost upon recompilation of the source schema. 
//Generated on: 2018.02.22 at 09:48:02 PM EST 

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
*         &lt;element name="empleadoInfo" type="{http://training.lab/empleado-ws}empleadoInfo"/>
*       &lt;/sequence>
*     &lt;/restriction>
*   &lt;/complexContent>
* &lt;/complexType>
* </pre>
* 
* 
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
 "empleadoInfo"
})
@XmlRootElement(name = "getEmpleadoByIdResponse")
public class GetEmpleadoByIdResponse {

 @XmlElement(required = true)
 protected EmpleadoInfo empleadoInfo;

 /**
  * Gets the value of the articleInfo property.
  * 
  * @return
  *     possible object is
  *     {@link EmpleadoInfo }
  *     
  */
 public EmpleadoInfo getEmpleadoInfo() {
     return empleadoInfo;
 }

 /**
  * Sets the value of the articleInfo property.
  * 
  * @param value
  *     allowed object is
  *     {@link EmpleadoInfo }
  *     
  */
 public void setEmpleadoInfo(EmpleadoInfo value) {
     this.empleadoInfo = value;
 }

}
