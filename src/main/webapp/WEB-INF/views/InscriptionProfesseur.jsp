<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inscription Professeur</title>
</head>
<body>

<h3>Inscription Professeur</h3>
<form:form method="POST"  modelAttribute="professeur">
    <table>
        <tr>
            <td>Nom</td>
            <td><form:input path="nom"/></td>
            <td><form:errors path="nom"/></td>
        </tr>
        <tr>
            <td>Pr�nom</td>
            <td><form:input path="prenom"/></td>
            <td><form:errors path="prenom"/></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><form:input path="email"/></td>
            <td><form:errors path="email"/></td>
        </tr>
        <tr>
            <td>T�l�phone</td>
            <td><form:input path="tel"/></td>
            <td><form:errors path="tel"/></td>
        </tr>
        <tr>
            <td>R�ference</td>
            <td><form:input path="reference"/></td>
            <td><form:errors path="reference"/></td>
        </tr>
         <tr>
            <td>nom utilisateur</td>
            <td><form:input path="compte.nomUtilisateur"/></td>
            <td><form:errors path="compte.nomUtilisateur"/></td>
        </tr>
        <tr>
            <td>Mot de passe</td>
            <td><form:input path="compte.motDePasse"/></td>
            <td><form:errors path="compte.motDePasse"/></td>
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