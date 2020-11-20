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
<link href="Assets/css/bootstrap.min.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<br>

	<form action="TraiteUtilisateur" method="post">
		<div class="container">
			<div class="row">
				<div class="col-md-2"></div>

				<div class="col-md-8">
					<div class="text-center">
						<div>

							<p>
								<img src="Images/user.png">
							</p>



						</div>
						<div class="jumbotron">

							<form class="form-signin">
								<h2 class="form-signin-heading">Veuillez vous authentifier</h2>
								<label for="inputuser" class="sr-only">Username</label> <input
									type="text" name="inputuser" class="form-control"
									placeholder="nameuser" required autofocus> <label
									for="inputPassword" class="sr-only">Password</label> <input
									type="password" name="inputPassword" class="form-control"
									placeholder="Password" required>
								<div class="checkbox">
									<label> <input type="checkbox"
										value="retenir le mot de passe"> Retenir le mot de
										passe
									</label>
								</div>
								<button class="btn btn-lg btn-primary btn-block" type="submit">Se
									connecter</button>
							</form>
							
							<%
		String message = (String) request.getAttribute("erreur");
	%>
	<%
		if (message != null)
			out.print(message);
	%>
						</div>
					</div>
				</div>
				<div class="col-md-2"></div>

			</div>

		</div>
	</form>
	
	<!-- /container -->


	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>


	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="Assets/js/bootstrap.min.js"></script>
</body>
</html>