<!DOCTYPE html>
<html>
<head>
<%@ include file="header.jsp"%>
</head>
<body>

	<%
		String user = request.getParameter("usuario");
		String pass = request.getParameter("password");
		
		if ("training".equals(user) && "training".equals(pass)) {
			out.println("login ok");
		} else {
			out.println("login invalido");
		}
		
		
		Integer contador = (Integer)session.getAttribute("contadorVisitas");
		
		
        if(contador!=null) {
            contador = Integer.valueOf(contador);
        } else {
            contador = 0;
        }
        
        if(contador!=0) {
            out.println("<p>Ejecuciones de la aplicación en esta sesión: "+contador+ "</p>");
        }
        
        contador++;
        session.setAttribute("contadorVisitas", contador);
	%>
	
</body>
</body>
</html>