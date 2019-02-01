<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Info</title>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-1.10.2.js">
</script>
</head>
<body>
<a href="addEmp.jsp">Add New Employee</a>
<center>Employee Information</center>
<center><div id="eachTable"></div></center>
</body>
<script>
$(document).ready(function(){
	$.ajax({
		type:'GET',
		url:'getAllEmp',
		 dataType: "json",
		success : function(data, textStatus, jqXHR) {
			console.log("jqXHR-----------"+JSON.stringify(jqXHR));
			console.log(data);
				$.each(data, function (i, obj) {    
			    	var eTable="<table><tr><th></th></tr><tr><th>ID</th><th>NAME</th><th>ADDRESS</th><th>SALARY</th></tr><tbody>"
			    		$.each(data,function(index, row){
			    		
			    		 
			    		    eTable += "<tr>";
			    		    $.each(row,function(key,value){
			    		      eTable += "<td>"+value+"</td>";
			    		      eTable+= "td"++"</td>";
			    		    });
			    		    eTable += "</tr>";
			    		  });
			    		  eTable +="</tbody></table>";
			    		  $('#eachTable').html(eTable);
			    		  
			    		  $('#eachTable').css({
			    			    border: '1px solid red',
			    			    
			    			});
				});
			},
			error:function (request, status, error) {
		      console.log("request-----"+JSON.stringify(request));
		    
		    }
	});
});
</script>
</html>