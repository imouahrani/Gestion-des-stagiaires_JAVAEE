<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<b style="color: red;"> <%
 	String message = (String) request.getAttribute("m");
 	if (message != null) {

 		out.print(message);
 	}
 %>
	</b>

	<form action="TraiteInscription" method="post">
		<h3 style="float: right; padding-right: 300px;">Demande formation
			php</h3>
		<br> <br>

		<table>
			<caption style="float: left; font-weight: bold;">Vos
				informations:</caption>

			<%="<br>"%>
			<%="<br>"%>
			<tr>


				<td>Civilité</td>
				<td><input type="radio" name="civilite" value="Mme">Mme</td>
				<td><input type="radio" name="civilite" value="Mr">Mr</td>



			</tr>

			<tr>

				<td>Nom:</td>
				<td><input type="text" name="nom"></td>


			</tr>
			<tr>

				<td>Prénom:</td>
				<td><input type="text" name="prenom"></td>


			</tr>
			<tr>

				<td>Tel:</td>
				<td><input type="text" name="tel"></td>


			</tr>
			<tr>

				<td>Domaine:</td>
				<td><select name="domaine">
						<option>Informatique</option>
						<option>Automatique</option>

				</select></td>


			</tr>
			<tr>

				<td>Vous maitrisez HTML et CSS ?</td>
				<td><input type="checkbox" name="question">Oui</td>
				<td><input type="checkbox" name="question">Non</td>


			</tr>
			<caption style="float: left; font-weight: bold;">Disponibilité:</caption>

			<tr>
				<td>Dimanche</td>
				<td><input type="checkbox" name="matin">Matin</td>
				<td><input type="checkbox" name="aprem">Apres-midi</td>


			</tr>


			<tr>
				<td>Lundi</td>
				<td><input type="checkbox" name="matin">Matin</td>
				<td><input type="checkbox" name="aprem">Apres-midi</td>


			</tr>
			<tr>
				<td>Mardi</td>
				<td><input type="checkbox" name="matin">Matin</td>
				<td><input type="checkbox" name="aprem">Apres-midi</td>


			</tr>
			<tr>
				<td>Mercredi</td>
				<td><input type="checkbox" name="matin">Matin</td>
				<td><input type="checkbox" name="aprem">Apres-midi</td>


			</tr>
			<tr>
				<td>Jeudi</td>
				<td><input type="checkbox" name="matin">Matin</td>
				<td><input type="checkbox" name="aprem">Apres-midi</td>


			</tr>







		</table>


		<input type="submit" value="Enregistrer">



	</form>














</body>
</html>