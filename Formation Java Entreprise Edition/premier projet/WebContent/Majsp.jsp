<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <p> Je suis une JSP </p>
 <%! String ch="Bonjour"; %>
 <%="Je m'appelle : "+ch %>
 <%! 	
     float moyenne = 16.5f; 
     int age = 20;
     
    %>
   <%= "je m appelle Imene j'ai"+age+"ans et j'ai"+moyenne+"de moyenne" %>
   <%! 
   		public int somme(int a, int b){
	   
	    return a+b;
   }
   %>
   <%="la somme est"+somme(10,5)
   
   %>
   <!-- reccupération dune donnee de la servlet  -->
   
   <% 
   
   		String ch =(String)request.getAttribute("prompteur");
   		out.println("mon promoteur préféré est"+ch);
   
   %>
   
</body>
</html>