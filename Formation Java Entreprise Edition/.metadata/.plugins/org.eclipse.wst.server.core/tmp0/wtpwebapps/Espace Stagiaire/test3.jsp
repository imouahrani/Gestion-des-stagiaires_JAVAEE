<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Bootstrap 101 Template</title>

<!-- Bootstrap -->
<link href="Assest/css/bootstrap.min.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<br>
	<br>
	<br>
	<br>
	<div class="container">

		<form class="form-signin">
			<div class="row">

				<div class="col-md-4">
					<div class="text-center">
						<img src="Images/user.png">
										<div class ="jumbotron">
						


						<h3>Veuillez renseigner les champ</h3>
						<table>

							<tr>

								<td>Prenom</td>
								<td><input type="text" name="prenom"></td>
							</tr>

							<tr>

								<td>Nom</td>
								<td><input type="text" name="nom"></td>
							</tr>
							<tr>

								<td>Niveau</td>
								<td><select name="niveau">

										<option>L1</option>
										<option>L2</option>
										<option>L3</option>
										<option>M1</option>


								</select></td>
							</tr>
							<tr>

								<td>Langage</td>
								<td><select name="langage" value="langage">

										<option>L1</option>
										<option>L2</option>
										<option>L3</option>
										<option>M1</option>


								</select></td>
							</tr>





						</table>
					
					
				
				</div>
				</div>
				</div>
				</div>
				
				</form>
				

			</div>

				<div class="col-md-8"></div>



	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="Assets/js/bootstrap.min.js"></script>


</body>
</html>
