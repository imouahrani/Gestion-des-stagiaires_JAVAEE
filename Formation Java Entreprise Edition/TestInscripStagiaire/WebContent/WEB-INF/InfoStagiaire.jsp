<%@page import="javafx.stage.Stage"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="dz.TestInscripStagiaire.bean.*" %>
        <%@ page import="dz.TestInscripStagiaire.servlet.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<br><br><br><br>
<b style="color: green;">
<%

	String message = (String)request.getAttribute("msg");
	if(message != null)
		out.print(message);




%>
</b>

<%
   Stagiaire st = (Stagiaire) request.getAttribute("stg");






%>
<br><br>
<b style="color: blue">
<%="Bienvenue" %>
${stg.nom}
<%=" " %>

${stg.prenom}
</b>
	<form action="TraiteStagiaire" method="get">

		<table >


			<tr>

				<td>Nom:</td>

				<td>${stg.nom}</td>


			</tr>
			<tr>

				<td>Prénom</td>

				<td>${stg.prenom}</td>


			</tr>


			<tr>

				<td>N° de tel:</td>

				<td>${st.numtel}</td>


			</tr>


			<tr>

				<td>Email</td>

				<td>${stg.email}</td>


			</tr>






		</table>
		<br>
		<input type="submit"  value="Envoyer">










	</form>










</body>
</html>