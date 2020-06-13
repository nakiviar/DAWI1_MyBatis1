<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>

<!DOCTYPE html>

<html lang="esS">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>



</head>
<body>
	<s:actionerror theme="bootstrap" />
	<s:actionmessage theme="bootstrap" />
	<s:fielderror theme="bootstrap" />

	<div class="container">
		<h1>Listado de Productos</h1>

		<a class="btn btn-primary" href="#">Ver data</a>
		<a class="btn btn-primary" href="#">Registra</a>
	</div>

	<br>
	<br>
	<div class="container">
		<table class="table">

			<tr>
				<th>Id</th>
				<th>Producto</th>
				<th>Precio</th>
				<th>Stock</th>
				<th></th>
				<th></th>
			</tr>
			
				<tr class="grilla_campo">
					<td>AAA</td>
					<td>BBB</td>
					<td>CCC</td>
					<td>DDD</td>
					<td></td>
					<td></td>
				</tr>
			
		</table>
	</div>


</body>
</html>

