<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee Info</title>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-1.10.2.js">
</script>
</head>
<body>
<form id="addEmpForm">
<label for="empId">EmpId:</label>
<input type="text" id=empId><br>
<label for="empName">EmpName</label>
<input type="text" id=empName><br>
<label for="address">Address:</label>
<input type="text" id=address><br>
<label for="salary">Salary:</label>
<input type="text" id=salary><br>
<input type="submit" value="Add" id="addEmp">
<br><br><br>
<div id="result" style="color:green;">
</div>
</form>
</body>

<script>

$(document).ready(function(){
	$('#addEmp').click(function(){
		var id=$('#empId').val();
		var empName=$('#empName').val();
		var address=$('#address').val();
		var salary=$('#salary').val();
	
		$.ajax({
			type:'POST',
			url:'addEmp',
			dataType: 'json',
			contentType: 'application/x-www-form-urlencoded',
			data:{
				id:id,
				empName:empName,
				address:address,
				salary:salary
			},
			success:function(data, textStatus, jqXHR){
				console.log('data--------------'+data);
				console.log(textStatus+''+JSON.stringify(jqXHR));
				$('#result').html(data);
			},
			error:function(request, status, error){
				$('#result').html(status);
				alert('err--'+error)
			}
		});
		return false;
	});
});
</script>
</html>