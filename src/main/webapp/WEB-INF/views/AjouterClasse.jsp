<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inscription Developpeur</title>
</head>
<body>
	<h3>Ajouter classe</h3>
	<form:form method="POST" modelAttribute="Classe">
		<table>
			<tr>
				<td>Nom Classe</td>
				<td><form:input path="nom" /></td>
			</tr>
			<tr>
				<td>Nombre des �tudiants</td>
				<td><form:input path="nbrEtudiants" /></td>
			</tr>
			<tr>
				<td>Etablissement</td>
				<td><form:input path="etablissement"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>