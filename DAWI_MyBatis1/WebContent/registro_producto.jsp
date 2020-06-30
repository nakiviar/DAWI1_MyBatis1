<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-bootstrap-tags" prefix="sb"%>

<%@ taglib uri="/struts-jquery-tags" prefix="sj"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Registro | Productos</title>
<sb:head />
<sj:head />
</head>
<body>
	<div id="" style="margin-left: 30%; margin-right: 30%;">
		<h1>REGISTRO DE PRODUCTOS</h1>
		<s:form action="regprod" theme="bootstrap">

			<!--  IDPROD -->

			<s:textfield name="p.codigo" label="Codigo"
				placeholder="Ingrese el codigo"></s:textfield>

			<!-- DESCRIPCION -->

			<s:textfield name="p.descripcion" label="Descripcion del prod."
				placeholder="Ingrese su apellido"></s:textfield>

			<!-- STOCK -->

			<s:textfield type="number" name="p.stock" label="Stock"
				placeholder="Ingrese el stock"></s:textfield>

			<!-- PRECIO -->

			<s:textfield type="number" name="p.precio" label="Precio"
				placeholder="Ingrese Precio"></s:textfield>

			<!-- IDCATEGORIA -->

			<!-- Para linear el combo :  -->
			<!-- Combo ruta: http://localhost:8090/Ejercicio2/llenarCombo -->

			<s:url id="idCat" action="llenaCombo" />

			<sj:select label="Categoria" name="p.idcat" list="listaCategorias"
				href="%{idCat}" listKey="idcat" listValue="descripcion"
				headerKey="-1" headerValue="Seleccione" cssClass="form-control"></sj:select>

			<s:url id="idCat2" action="llenaCombo" />

			<sj:autocompleter label="Categoria" list="listaCategorias"
				href="%{idCat2}" listKey="idcat" listValue="descripcion"
				headerKey="-1" headerValue="Seleccione" cssClass="form-control"></sj:autocompleter>

			<!-- ESTADO -->

			<s:select label="Estado" name="p.estado"
				list="#{'-1':'Seleccionar','1':'disponible','0':'agotado'}"></s:select>


			<s:submit value="Registrar" cssClass="btn btn-primary" action="regprod"></s:submit>
			<s:submit value="Eliminar" cssClass="btn btn-info" action="elimprod"></s:submit>
			<s:submit value="Actualizar" cssClass="btn btn-danger" action="actprod"></s:submit>
			<s:submit value="Listado" cssClass="btn btn-warning" action="listprod"></s:submit>
		</s:form>
		<br>
		<s:actionmessage theme="bootstrap" />
		<s:actionerror theme="bootstrap" />
		<br>
		<p>
			Mensaje sin bootstrap :
			<s:property value="mensaje" />
		</p>
	</div>
</body>
</html>
