<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page session="true"%>
<html>
<head>
<title>Login Page</title>
    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<c:url value="/resources/css/loginPage.css"/>" rel="stylesheet" type="text/css">

    <script src="<c:url value="http://code.jquery.com/jquery-1.11.3.min.js" />"></script>
    <script src="<c:url value="/resources/js/loginScript.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3">
			<div class="panel panel-login">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-6">
							<a href="#" class="active" id="login-form-link">Login</a>
						</div>
						<div class="col-xs-6">
							<a href="#" id="register-form-link">Register</a>
						</div>
					</div>
					<hr>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-12">
							<form id="login-form" action="<c:url value="/j_spring_security_check"/>" method="post" style="display: block;">
								<div class="form-group">
									<input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
								</div>
								<div class="form-group">
									<input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
								</div>
								<div class="form-group text-center">
									<input type="checkbox" tabindex="3" class="" name="remember" id="remember">
									<label for="remember"> Remember Me</label>
								</div>
								<div class="form-group">
									<div class="row">
										<div class="col-sm-6 col-sm-offset-3">
											<input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
										</div>
									</div>
								</div>
								<div class="form-group">
									<div class="row">
										<div class="col-lg-12">
											<div class="text-center">
												<a href="http://phpoll.com/recover" tabindex="5" class="forgot-password">Forgot Password?</a>
											</div>
										</div>
									</div>
								</div>
							</form>
							<form:form modelAttribute="user" id="register-form" action="${pageContext.request.contextPath}/registration"  method="post" role="form" style="display: none;">
								<div class="form-group">
									<form:input type="text" path="username" placeholder="Username" class="form-control"/>
								</div>
								<div class="form-group">
									<form:input type="text" path="email" placeholder="Email" class="form-control"/>
								</div>
								<div class="form-group">
									<form:input type="text" path="firstname" placeholder="First_Name"  class="form-control"/>
								</div>
								<div class="form-group">
									<form:input type="text" path="lastName" class="form-control" placeholder="Last_Name" />
								</div>
								<div class="form-group">
									<form:input type="password" path="password" class="form-control"/>
								</div>
								<div class="form-group ">
									<form:input type="date" path="bDay" placeholder="B_Day" id="birthday" class="form-control"/>
								</div>
								<div class="form-group">
									<div class="row">
										<div class="col-sm-6 col-sm-offset-3">
											<input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">
										</div>
									</div>
								</div>
							</form:form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

</body>
</html>