<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-bootstrap-tags" prefix="sb"%>
<!DOCTYPE html>
<html  lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<sb:head />
</head>
<body>
	<div id="" style="margin-left: 30%; margin-right: 30%;">
		<h1>Registre sus datos</h1>
		<s:form action="reg" theme="bootstrap">

			<s:textfield name="u.nombre" label="Nombre" pattern="[a-z]{1,15}" placeholder="Ingrese su nombre"></s:textfield>
			<s:textfield name="u.apellido" label="Apellido" placeholder="Ingrese su apellido"></s:textfield>
			<s:textfield type="email" name="u.usuario" label="Correo"  placeholder="Ingrese su correo"></s:textfield>
			<s:textfield type="password" name="u.clave" label="Clave" placeholder="Ingrese Clave"></s:textfield>
			<s:textfield type="date" name="u.fecha" label="Fecha de Nac" placeholder="Año/ Mes /Dia)"></s:textfield>
			<s:select label="Sede" name="sede" list="#{'D01':'Miraflores','D02':'Breña','D03':'Independencia'}"></s:select>
			<s:submit value="Registrar" cssClass="btn"></s:submit>
		</s:form>
		<p>
			<s:property value="mensaje" />
		</p>
		<br>
		<p>
			Si ya tiene cuenta, INGRESE <a href="login.jsp">aqui </a>
		</p>
	</div>
</body>
</html>