<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="es">

    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link href="<c:url value="/resources/css/style.css" />
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
        <title>Wallets</title>
    </head>
    <body>
        <div class="table-wallet">
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