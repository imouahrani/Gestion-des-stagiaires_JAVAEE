<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Stagiaire</title>
</head>
<body>
	<h3>Renseignez les champs</h3>

	<form action="TraiteStagiaire" method="post">
		<table>

			<tr>

				<td>Nom:</td>
				<td><input type="text" name="nom"></td>


			</tr>
			<tr>

				<td>Prénom:</td>
				<td><input type="text" name="prenom"></td>


			</tr>
			<tr>
				<td>N° de téléphone:</td>
				<td><input type="text" name="numtel"></td>


			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"></td>



			</tr>


		</table>

		<input type="submit" name="sinscrire" value="S'inscrire">
	</form>
	<b style="color: red;"> <%
 	String message = (String) request.getAttribute("msg");
 	if (message != null) {

 		out.println(message);
 	}
 %>
	</b>

</body>
</html>