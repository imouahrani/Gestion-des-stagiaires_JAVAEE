<%@page import="dz.LoginProjet.bean.Inscription"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Inscription s = (Inscription) request.getAttribute("ids");
	%>
	<%="<br>"%><%="<br>"%>
	<b style="text-align: center;"> <%="Bonjour "%>${ids.civilite}<%=" "%> ${ids.nom}

		<%=" "%> ${ids.prenom} <%="<br>"%> <%
 	String message = (String) request.getAttribute("m");
 	if (message != null)
 		out.print(message);
 %>
	</b>

	<%="<br>"%>
	<%="<br>"%>
	<%="Téléphone: "%>
	${ids.tel}
	<%="<br>"%>

	<%="Prérequis: "%>
	${ids.question}

	<%="<br>"%>
	<%="<br>"%>
	<%
		String message2 = (String) request.getAttribute("msg");
		if (message2 != null)

			out.print(message2);
	%>
	<%="<br>"%>
	<%="Les papiers necessaires sont: photos d'identite/Photocopie piece didentite/Extrait de naissance"%>
	<%="<br>"%>
	<%="Le prix de la formation est : 800 DA"%>
	<%="<br>"%><%="<br>"%>
	<b style="font-weight: bold;"> <%="Pour plus dinformations appelez le 034 19 40 46"%>
	</b>



</body>
</html>