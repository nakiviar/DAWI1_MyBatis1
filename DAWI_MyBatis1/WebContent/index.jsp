<%@ page language="java" contentType="text/html; charset=UTF-8"
 	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-jquery-tags" prefix="sj" %>
<%@taglib uri="/struts-bootstrap-tags" prefix="sb"%>
<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="UTF-8">
<title>Insert title here</title>



<style type="text/css">
.welcome {
	background-color: #DDFFDD;
	border: 1px solid #009900;
	width: 200px;
}
.welcome li {
	list-style: none;
}
</style>

<sj:head/>
<sj:head jqueryui="true" jquerytheme="blitzer"/>
<sb:head/>
</head>


<body>
<h1>Struts 2 Struts 2 ActionError &amp; ActionMessage Example</h1>

	

	<s:actionmessage  theme="bootstrap"/>

	<p>
		<s:property value="mensaje" />
	</p>
	
</body>
</html>