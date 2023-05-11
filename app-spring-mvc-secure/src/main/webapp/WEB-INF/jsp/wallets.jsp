<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="es">

    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css"
        integrity="sha384-b6lVK+yci+bfDmaY1u0zE8YYJt0TZxLEAFyYSLHId4xoVvsrQu3INevFKo+Xir8e" crossorigin="anonymous">
        <title>Wallets</title>
    </head>
    <body>
        <div class="table-wallet" style="width=60%">
            <h1 class="text-lg-center">Wallets del usuario</h1>        

                <table class="table table-striped table-bordered table-primary">
                    <thead>
                        <tr>
                            <th>tipo de Moneda</th>
                            <th>Código</th>
                            <th>Balance</th>
                            <th>Dirección</th>
                        </tr>
                    </thead>

                    <tbody>
                        <c:forEach var="wall" items="${list}">
								<tr>
									<td>${wall.moneda_idmoneda}</td>
									<td>${wall.code}</td>
									<td>${wall.balance}</td>
									<td>${wall.address}</td>
																									
								</tr>
						</c:forEach>
                    </tbody>

                </table>
        </div>

	<script src="<c:url value="/resources/js/bootstrap.min.js" />" ></script>
	

    </body>







</html>