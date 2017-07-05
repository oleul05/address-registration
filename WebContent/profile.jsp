<%@ page import="java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Profile</title>
<!-- Core CSS - Include with every page -->
<link href="assets/plugins/bootstrap/bootstrap.css" rel="stylesheet" />
<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link href="assets/plugins/pace/pace-theme-big-counter.css"
	rel="stylesheet" />
<link href="assets/css/style.css" rel="stylesheet" />
<link href="assets/css/main-style.css" rel="stylesheet" />

</head>

<body class="body-Login-back">

	<div class="container">

		<div class="row">
			<div class="col-md-12 text-center">
				<h2>
					Welcome
					<%=session.getAttribute("username")%>
				</h2>
			</div>
			<div class="col-md-6 col-md-offset-3 ">
				<div class="login-panel panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Save Your profile</h3>
					</div>
					<div class="panel-body">
						<form class="form-horizontal" action="update" method="POST">
							<input type="hidden"
								value="<%=session.getAttribute("password")%>" name="username">
							<div class="form-group">
								<label class="control-label col-sm-2">Name:</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" name="name"
										value="<c:out value="${user.name}" />">
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-2" for="pwd">Surname:</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" name="surname"
										value="${user.surname}">
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-2" for="pwd">Phone:</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" name="phone"
										value="${user.phone}">
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-2" for="pwd">Address:</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" name="address"
										value="${user.address}">
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-2">Age:</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" name="age"
										value="${user.age}">
								</div>
							</div>

							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-2">
									<input type="submit" class="btn btn-default" value="Update">
								</div>
								<!-- <div class="col-sm-offset-2 col-sm-2">
									<button type="reset" value="Reset">Reset</button>
								</div> -->
								<div class="col-sm-2">
									<a href="login">Logout</a>
								</div>
							</div>
						</form>
						<form action="" method="POST">
							<div class="col-sm-4">
								<a href="share.jsp">See Shared Contacts</a>
							</div>
							<div class="col-sm-offset-2 col-sm-2">
								<input type="submit" class="btn btn-default" value="Share">
							</div>
						</form>
						
					</div>
				</div>
				<div id="topmsg" style="display: none;"></div>
			</div>

		</div>
	</div>

	<!-- Core Scripts - Include with every page -->
	<script src="assets/plugins/jquery-1.10.2.js"></script>
	<script src="assets/plugins/bootstrap/bootstrap.min.js"></script>
	<script src="assets/plugins/metisMenu/jquery.metisMenu.js"></script>
	<script src="assets/scripts/login.js"></script>

</body>

</html>
