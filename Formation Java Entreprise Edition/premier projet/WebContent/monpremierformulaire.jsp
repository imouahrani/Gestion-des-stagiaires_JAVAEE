<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulaire d'inscription</title>
</head>
<body>
	<h4>Renseignez les champs</h4>
	<form action="TraiteFormulaire" method="post">
		<table border="1">
			<tr>
				<td>Nom:</td>
				<td><input type="text" name="nom" /></td>


			</tr>

			<tr>

				<td>Prénom:</td>
				<td><input type="text" name="prenom" /></td>


			</tr>


			<tr>
				<td>Sexe:</td>
				<td><input type="radio" name="sexe" value="Femme">Féminin</input></td>
				<td><input type="radio" name="sexe" value="Homme">Masculin</input></td>
			</tr>
			<tr>
				<td>Niveau :</td>
				<td><select name="niveau">

						<option>L1</option>
						<option>L2</option>
						<option>L3</option>
						<option>M1</option>
						<option>M2</option>


				</select></td>
				<td></td>
			</tr>
			<tr>
				<td>Formation</td>
				<td><input type="checkbox" name="formation" value="java">Java</td>

				<td><input type="checkbox" name="formation" value="python">Python</td>
			</tr>

			<tr>

				<td>Note1:</td>
				<td><input type="text" name="note1" /></td>


			</tr>
			<tr>

				<td>Note2:</td>
				<td><input type="text" name="note2" /></td>


			</tr>





		</table>

		<input type="submit" name="Envoyer" />
	</form>
</body>
</html>