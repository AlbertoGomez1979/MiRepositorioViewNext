<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;&nbsp;charset=UTF-8">
<title>Presentación JSP</title>
</head>
<body>
    <!--COMENTARIO EN HTML-->
    <%--COMENTARIO EN JSP--%>

    <h2>EJEMPLO DE FUNCIONES O EXPRESIONES EN JSP</h2>
    <h4>Fecha y hora actual</h4>
    <%--MOSTRAR FECHA Y HORA ACTUAL--%>
    <%=new java.util.Date().toString() %><br>
    <br>

  
	<h4>Convertir a mayúsculas</h4>
	<%-- Convertir a mayúsculas un String --%>
	<%="Pasar a mayúsculas".toUpperCase()%><br>
	<br>

	<h4>Generar un número aleatorio</h4>
	<%-- Generar un número aleatorio --%>
	<%=new java.util.Random().nextInt(100)%>


    <h4>ESTO ES UN SCRIPTLE</h4>
    <%!int n = 0;%>
    Página accesada
    <%=++n%>
    veces
    <%
    if ((n % 10) == 0) {
        n = 0;
    }
    %> <br><br>

    <%
    java.util.Calendar ahora = java.util.Calendar.getInstance();
    int hora = ahora.get(java.util.Calendar.HOUR_OF_DAY);
    %>
    <b> Otro ejemplo de Scriptle, <br><i> <%
    
     if ((hora > 20) || (hora < 6)) {
         %> Es de noches <%
     } else if ((hora >= 6) && (hora <= 12)) {
         %> Es de mañana <%
     } else {
        %> Es de tardes <%
     }
     %>
    </i>
    </b>


     <%! private int accesos = 0; %>
    <h1> Visitas: <%= ++accesos %> </h1>



</body>