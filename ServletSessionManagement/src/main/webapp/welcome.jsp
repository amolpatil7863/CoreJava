<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>	
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>

<%
	String name=session.getAttribute("username").toString();
	if(name==null){
		response.sendRedirect("/index.jsp");
	}
%>
<%=name %><h2>Logout</h2>
<form action="logout" method="post">
	<input type="submit" value="Logout" >
</form>

 
 <%-- <c:forEach var = "i" begin = "1" end = "5">
         Item <c:out value = "${i}"/><p>
 </c:forEach>
 
 <c:catch var ="catchException">
         <% int x = 5/0;%>
 </c:catch>

      <c:if test = "${catchException!= null}">
         <p>The exception is : ${catchException} <br />
         There is an exception: ${catchException.message}</p>
 	  </c:if>
 	  
 	  
 	  
 	  <c:set var = "salary" scope = "session" value = "${2000*2}"/>
      <p>Your salary is : <c:out value = "${salary}"/></p>
      <c:choose>
         
         <c:when test = "${salary <= 0}">
            Salary is very low to survive.
         </c:when>
         
         <c:when test = "${salary > 1000}">
            Salary is very good.
         </c:when>
         
         <c:otherwise>
            No comment sir...
         </c:otherwise>
      </c:choose>
 	  
 	        <c:redirect url = "http://www.photofuntoos.com"/> --%>
 	  
 

<%-- <%

out.println("Session:-"+session);
out.println("request"+request);
out.println("response"+response);

%>
	

	<!--<%
	if(session.getAttribute("user") == null){
		response.sendRedirect("index.jsp");
		
	}
	%> --> --%>
	
	
	
	
	
</body>
</html>