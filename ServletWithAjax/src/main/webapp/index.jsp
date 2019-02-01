<html>
<head>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
	<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>

<!------ Include the above in your HEAD tag ---------->

</head>
<body>



	<section class="login-block">
		<div class="container">
			<div class="row">
				<div class="col-md-4 login-sec">
					<h2 class="text-center">Login Now</h2>
					<!-- <form class="login-form" id="myForm">
  <div class="form-group">
    <label for="exampleInputEmail1" class="text-uppercase">Username</label>
    <input type="text" class="form-control" placeholder="" id="email">
    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1" class="text-uppercase">Password</label>
    <input type="password" id="password" class="form-control" placeholder="">
  </div>
  
  
    <div class="form-check">
    <label class="form-check-label">
      <input type="checkbox" class="form-check-input">
      <small>Remember Me</small>
    </label>
    <button type="submit" class="btn btn-login float-right" id="login">Submit</button>
    <img id="loader" src="images/loader.gif">
<div id="login_status"></div>
  </div>
  
</form> -->


					<form action="login_success" method="POST">
 User Name:<input type="text" name="userName"/><br/>
 Password:<input type="password" name="userPassword"/><br/>
 <input type="submit" value="submit"/>
</form>

				</div>
			</div>
		</div>
	</section>



</body>

</html>

