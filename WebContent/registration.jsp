<%@ page import="java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Page</title>
    <!-- Core CSS - Include with every page -->
    <link href="assets/plugins/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="assets/plugins/pace/pace-theme-big-counter.css" rel="stylesheet" />
    <link href="assets/css/style.css" rel="stylesheet" />
      <link href="assets/css/main-style.css" rel="stylesheet" />

</head>

<body class="body-Login-back">

    <div class="container">
       
        <div class="row">
            <div class="col-md-12 text-center logo-margin ">
              <h2>Please Register here</h2>
			</div>
            <div class="col-md-4 col-md-offset-4 ">
                <div class="login-panel panel panel-default">                  
                    <div class="panel-heading">
                        <h3 class="panel-title">Please Register</h3>
                    </div>
                    <div class="panel-body">
                        <form id="registration" action="registration" method="POST">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Username" id="username" name="username" type="text">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Password" id="password" name="password" type="password">
                                </div>
                                <div class="checkbox">
                                    <label>
                                    	Already member <a href="#"> login here</a>
                                    </label>
                                </div>
                                <!-- Change this to a button or input when using this as a form -->
                                <Button type="submit" class="btn btn-lg btn-success">Register</button>
                            </fieldset>
                        </form>
                    </div>
                </div>
				<div id="topmsg" style="display:none;"></div>
            </div>

        </div>
    </div>

     <!-- Core Scripts - Include with every page -->
    <script src="assets/plugins/jquery-1.10.2.js"></script> 
    <script src="assets/plugins/bootstrap/bootstrap.min.js"></script>
    <!-- <script src="assets/plugins/metisMenu/jquery.metisMenu.js"></script> -->
	<!-- <script src="assets/scripts/login.js"></script> -->

</body>

</html>
