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
					Welcome <%=session.getAttribute("username")%> </h2>
			</div>
			<div class="col-md-6 col-md-offset-3 ">
				<div class="login-panel panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title"><center>Want to delete</center></h3>
					</div>
					<div class="panel-body">
						<form class="form-horizontal" action="delete" method="POST">
						<input type="hidden" value="<%=session.getAttribute("username")%>" name="username">
						<input type="hidden" value=" " name="name">
						<input type="hidden" value=" " name="surname">
						<input type="hidden" value=" " name="phone">
						<input type="hidden" value=" " name="address">
						<input type="hidden" value=" " name="age">
							
							<div class="form-group">
								<div class="col-sm-offset-5 col-sm-2">
									<input type="submit" class="btn btn-default" value="Delete">
								</div>
								
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
