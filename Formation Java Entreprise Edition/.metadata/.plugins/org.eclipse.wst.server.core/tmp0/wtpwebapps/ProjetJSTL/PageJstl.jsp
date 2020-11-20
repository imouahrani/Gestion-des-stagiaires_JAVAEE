
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:out value="Bonjour imene"></c:out>
	<br>
	<!-- declaration dune variable -->
	<c:set var="id" value="Je suis une variable"></c:set>
	<c:out value="${id}"></c:out><br>
	<!-- utilisation dune condition -->
	<c:set var="id1" value="15"></c:set>
	<c:if test="${id1 < 20 }">


		<c:out value="Repture de stock"></c:out>



	</c:if>
	<!-- test multiple -->
	<br>

	<c:choose>

		<c:when test="${id1<10}">
			<c:out value="Insuffisant"></c:out>
		</c:when>
		<c:when test="${id1>=10 && id1 <15}">
			<c:out value="Bien"></c:out>
			<br>
		</c:when>
		<c:when test="${id1 >=15}">
			<c:out value=" Très bien"></c:out>
			<br>
		</c:when>



	</c:choose>

	<!-- utilisation des boucles -->

	<c:forEach begin="1" end="10" step="1">

		<c:out value="Coucou c'est encore moi !!!!"></c:out>
		<br>

	</c:forEach>
	<c:forEach var="i" begin="1" end="5" step="1">
	
	<c:out value="Ligne numero ${i}"></c:out><br>
	
	
	
	
	
	</c:forEach>


</body>
</html>