<%@page import="dz.projetbean.bean.Produit"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>page produit</title>
</head>
<body>

	<h3 style="color: red; ">Info produit</h3>
	<%
		Produit p = (Produit)request.getAttribute("idecran");
	%>
	<%="Intitule: " + p.getIntitule()%><br>
	<%="Categorie: "%>
	${idecran.categorie}<br>
	<%="Prix unitaire:"%>
	${idecran.prix}<br>
	
	<%="Quantite: "%>
	${idecran.quantite}<br>
	<%="Prix total: "%>
	${idecran.quantite*idecran.prix}<br>
	<%="L'état du stock: " %>${idecran.quantite < 20 ?'Repture de stock':'Stock correcte'}
</body>
</html>