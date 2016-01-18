<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inscription Etudiant</title>
</head>
<body>

<h3>Inscription Etudiant</h3>
<form:form method="POST"  modelAttribute="">
    <table>
        <tr>
            <td>Nom</td>
            <td><form:input path="nom"/></td>
        </tr>
        <tr>
            <td>Prénom</td>
            <td><form:input path="prenom"/></td>
        </tr>
        <tr>
        <td>Email</td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td>Téléphone</td>
            <td><form:input path="tel"/></td>
        </tr>
        <tr>
            <td>CNE</td>
            <td><form:input path="cne"/></td>
        </tr>
         <tr>
            <td>nom utilisateur</td>
            <td><form:input path="compte.nomUtilisateur"/></td>
        </tr>
        <tr>
            <td>Mot de passe</td>
            <td><form:input path="compte.motDePasse"/></td>
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