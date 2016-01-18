<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Authentification</title>
</head>
<body>

<h3>Authentification</h3>
<form:form method="POST"  modelAttribute="Compte">
    <table>
         <tr>
            <td>nom utilisateur</td>
            <td><form:input path="nomUtilisateur"/></td>
        </tr>
        <tr>
            <td>Mot de passe</td>
            <td><form:input path="motDePasse"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>