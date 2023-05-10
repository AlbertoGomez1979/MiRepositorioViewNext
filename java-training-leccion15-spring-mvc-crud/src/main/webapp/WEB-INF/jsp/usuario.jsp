<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  


<form:form method="POST" action="/usuario">
<h1>Detalle del Usuario recogido en la web : https://jsonplaceholder.typicode.com/users, donde se le pasa un id</h1>
       
      	<table >  
         <tr>  
          <td>Nombre : </td> 
          <td><form:input path="name"/></td>
         </tr>  
         <tr>  
          <td>Username :</td>  
          <td><form:input path="username"/></td>
         </tr> 
         <tr>  
          <td>Email :</td>  
          <td><form:input path="email"/></td>
         </tr> 
         <tr>  
          <td>Telefono :</td>  
          <td><form:input path="phone"/></td>
         </tr>
         <tr>  
          <td>Web Site :</td>  
          <td><form:input path="website"/></td>
         </tr>
        </table>  
</form:form>