<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Spartan Gym Palizzi Marina</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />

<!-- GLOBAL MANDATORY STYLES -->
<link
	href="http://fonts.googleapis.com/css?family=Hind:300,400,500,600,700"
	rel="stylesheet" type="text/css">
<link href="vendor/simple-line-icons/simple-line-icons.min.css"
	rel="stylesheet" type="text/css" />
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />

<!-- PAGE LEVEL PLUGIN STYLES -->
<link href="css/animate.css" rel="stylesheet">
<link href="vendor/swiper/css/swiper.min.css" rel="stylesheet"
	type="text/css" />

<!-- THEME STYLES -->
<link href="css/layout.min.css" rel="stylesheet" type="text/css" />

<!-- Favicon -->
<link rel="shortcut icon" href="favicon.ico" />
</head>
<body>
	<header class="header navbar-fixed-top">
		<!-- Navbar -->
		<nav class="navbar" role="navigation">
			<div class="container">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="menu-container">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".nav-collapse">
						<span class="sr-only">Toggle navigation</span> <span
							class="toggle-icon"></span>
					</button>

					<!-- Logo -->
					<div class="logo">
						<a class="logo-wrap" href="index.html"> <img
							class="logo-img logo-img-main" src="img/logo.png"
							alt="Asentus Logo"> <img class="logo-img logo-img-active"
							src="img/logo-dark.png" alt="Asentus Logo">
						</a>
					</div>
					<!-- End Logo -->
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse nav-collapse">
					<div class="menu-container">
						<ul class="navbar-nav navbar-nav-right">
							<li class="nav-item"><a
								class="nav-item-child nav-item-hover active" href="index.html">Home</a></li>
							<li class="nav-item"><a
								class="nav-item-child nav-item-hover" href="faq.html">FAQ</a></li>
							<li class="nav-item"><a
								class="nav-item-child nav-item-hover" href="contact.html">Contact</a></li>
						</ul>
					</div>
				</div>
				<!-- End Navbar Collapse -->
			</div>
		</nav>
		<!-- Navbar -->
	</header>
	<br><br><br>
	<center>
	<form name="Login" action="RichiediLogin" method="post">
		Username: <input type="text" name="username" id="username"> <br>
		Password: <input type="password" name="password" id="password"> <br>
		<input type="submit" value="Accedi">
	</form>
</center>
   <br><br>
	
	<footer class="footer">
		<!-- Links -->
		<div class="footer-seperator">
			<div class="content-lg container">
				<div class="row">
					<div class="col-sm-2 sm-margin-b-50">
						<!-- List -->

						<!-- End List -->
					</div>
					<div class="col-sm-4 sm-margin-b-30">
						<!-- List -->
						<ul class="list-unstyled footer-list">
							
							<li class="footer-list-item"><a class="footer-list-link"
								href="#">Facebook</a></li>
							<li class="footer-list-item"><a class="footer-list-link"
								href="#">Instagram</a></li>
							
						</ul>
						<!-- End List -->
					</div>
					<div class="col-sm-5 sm-margin-b-30">
						<h2 class="color-white">Send Us A Note</h2>
						<input type="text" class="form-control footer-input margin-b-20"
							placeholder="Name" required> <input type="email"
							class="form-control footer-input margin-b-20" placeholder="Email"
							required> <input type="text"
							class="form-control footer-input margin-b-20" placeholder="Phone"
							required>
						<textarea class="form-control footer-input margin-b-30" rows="6"
							placeholder="Message" required></textarea>
						<button type="submit"
							class="btn-theme btn-theme-sm btn-base-bg text-uppercase">Submit</button>
					</div>
				</div>
				<!--// end row -->
			</div>
		</div>
		<!-- End Links -->

		<!-- Copyright -->
		<div class="content container">
			<div class="row">
				<div class="col-xs-6">
					<img class="footer-logo" src="img/logo.png" alt="Asentus Logo">
				</div>
				<div class="col-xs-6 text-right">
					<p class="margin-b-0">
						<a class="color-base fweight-700"
							href="http://keenthemes.com/preview/asentus/">Asentus</a> Theme
						Powered by: <a class="color-base fweight-700"
							href="http://www.keenthemes.com/">KeenThemes.com</a>
					</p>
				</div>
			</div>
			<!--// end row -->
		</div>
		<!-- End Copyright -->
	</footer>
</body>
</html>