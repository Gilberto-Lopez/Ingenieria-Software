<%-- 
    Document   : registro
    Created on : Feb 24, 2017, 7:58:50 PM
    Author     : gilis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <h1>Inicia sesión</h1>
		<br />
		<form method="POST" action="/Clase1/registrar">
			<input id="nombre" name="nombre" type="text" placeholder="Nombre" />
			<br />
			<input id="carrera" name="carrera" type="text" placeholder="Carrera" />
			<br />
			Fecha de nacimiento:
			<br />
			<select id="dd" name="dd">
				<option value="1" selected>1</option>
				<%
					for (int i = 2; i <= 31; i++) {
						out.println("<option value='"+i+"'>"+i+"</option>");
					}
				%>
			</select>-
			<select id="mm" name="mm">
				<option value="1" selected>1</option>
				<%
					for (int i = 2; i <= 12; i++) {
						out.println("<option value='"+i+"'>"+i+"</option>");
					}
				%>
			</select>-
			<select id="yyyy" name="yyyy">
				<option value="2017" selected>2017</option>
				<%
					for (int i = 2016; i >= 1970; i--) {
						out.println("<option value='"+i+"'>"+i+"</option>");
					}
				%>
			</select>
			<br />
			<input id="correo" name="correo" type="text" placeholder="Correo" />
			<br />
			<input id="pass" name="pass" type="text" placeholder="Contraseña" />
			<br />
			<button>Aceptar</button>
		</form>
    </body>
</html>
