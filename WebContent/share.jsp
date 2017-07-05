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
			<div class="col-md-8 col-md-offset-2 ">
				<div class="login-panel panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Shared Contact</h3>
					</div>
					<div class="panel-body">
						<table class="table table-striped">
							<thead>
								<tr>
									<th>Name</th>
									<th>Surname</th>
									<th>Phone</th>
									<th>Address</th>
									<th>Age</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>John</td>
									<td>Doe</td>
									<td>1234</td>
									<td>Dhaka</td>
									<td>25</td>
								</tr>
								
							</tbody>
						</table>
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
