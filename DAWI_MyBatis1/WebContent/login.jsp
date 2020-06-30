<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-bootstrap-tags" prefix="sb"%>
<%@taglib uri="/struts-jquery-tags" prefix="sj" %>
<%--https://jqueryui.com/themeroller/ --%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<sb:head/>
<sj:head/>
<sj:head jqueryui="true" jquerytheme="blitzer"/>
</head>
<body>
	<div id="" style=" margin-right:30%;margin-left:30%;" >

		<h1>Acceso al sistema</h1>
		<s:form action="ingreso" theme="bootstrap">

			<s:textfield type="email" label="Usuario" name="usuario"
				placeholder="Ingrese su correo" tooltip="AAA@gg.es" ></s:textfield>
			<s:textfield type="password" name="clave" label="Contraseña"
				placeholder="Ingrese su clave"></s:textfield>
					
			<sj:submit value="Ingresar" cssClass="btn"></sj:submit>
			
				<s:actionerror theme="bootstrap"/>
				<s:actionmessage theme="bootstrap"/>

		</s:form>
		<p>
			<s:property value="mensaje" />
		</p>
		<br>
		<p>Si es usuario nuevo registrese <a href="registro.jsp">aqui </a> </p>
	</div>
</body>
</html>