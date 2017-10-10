<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>9GAG</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/blog-home.css" rel="stylesheet">

  </head>

  <body>

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="#">9GAG</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="#">Hot
                <span class="sr-only">(current)</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Trending</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="logInServlet.jsp">Log In</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" href="RegisterServlet.jsp">Join</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <!-- Page Content -->
    <div class="container">

      <div class="row">

        <!-- Blog Entries Column -->
        <div class="col-md-8">
        
        
  <!--      <div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-body">
						<div class="row">
							
						</div>
					</div>
				</div>
			</div> -->
			
          <div class="card mb-4" style="margin-top: 23px;">
            <div class="card-body">
            <div class="col-lg-12">
            <h1>Join</h1>
			<form id="login-form" action="RegisterServlet" method="post" role="form" style="display: block;">
				<div class="form-group">
					<input type="text" name="name" id="name" tabindex="1" class="form-control" placeholder="Name" value="">
				</div>
				<div class="form-group">
					<input type="text" name="email" id="email" tabindex="1" class="form-control" placeholder="Username" value="">
				</div>
				<div class="form-group">
					<input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
				</div>
				<div class="form-group">
					<div class="row">
						<div class="col-sm-6 col-sm-offset-3">
							<input type="submit" name="login" id="login-submit" class="btn btn-primary" tabindex="4" class="form-control btn btn-login" value="Log In">
						</div>
					</div>
				</div>
			</form>
		</div>
            </div>
          </div>

        </div>

        <!-- Sidebar Widgets Column -->
        <div class="col-md-4">

          <!-- Search Widget -->
          <div class="card my-4">
            <h5 class="card-header">Search</h5>
            <div class="card-body">
              <div class="input-group">
                <input type="text" class="form-control" placeholder="Search for...">
                <span class="input-group-btn">
                  <button class="btn btn-secondary" type="button">Go!</button>
                </span>
              </div>
            </div>
          </div>

          <!-- Categories Widget -->
          <div class="card my-4">
            <h5 class="card-header">More</h5>
            <div class="card-body">
              <div class="row">
                <div class="col-lg-6">
                  <ul class="list-unstyled mb-0">
                    <li>
                      <a href="#">Funny</a>
                    </li>
                    <li>
                      <a href="#">Video</a>
                    </li>
                    <li>
                      <a href="#">Gaming</a>
                    </li>
                    
                    <li>
                      <a href="#">WTF</a>
                    </li>
                    
                    <li>
                      <a href="#">Savage</a>
                    </li>
                    <li>
                      <a href="#">GIF</a>
                    </li>
                    <li>
                      <a href="#">Sport</a>
                    </li>
                    
                    <li>
                      <a href="#">Horror</a>
                    </li>
                    
                    <li>
                      <a href="#">Science</a>
                    </li>
                    
                    <li>
                      <a href="#">IMadeDis</a>
                    </li>
                  </ul>
                </div>
                <div class="col-lg-6">
                  <ul class="list-unstyled mb-0">
                    <li>
                      <a href="#">Sport</a>
                    </li>
                    <li>
                      <a href="#">Relationship</a>
                    </li>
                    <li>                    
                      <a href="#">Ask9GAG</a>
                    </li>
                    
                    <li>
                      <a href="#">Awesome</a>
                    </li>
                    
                    <li>
                      <a href="#">Gaming</a>
                    </li>
                    
                    <li>
                      <a href="#">MovieTV</a>
                    </li>
                    <li>
                      <a href="#">Comic</a>
                    </li>
                    <li>
                      <a href="#">GirlyThings</a>
                    </li>
                    
                    <li>
                      <a href="#">Animals</a>
                    </li>
                    
                    <li>
                      <a href="#">School</a>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>

        </div>

      </div>
      <!-- /.row -->

    </div>
    <!-- /.container -->

    <!-- Footer -->
    <footer class="py-5 bg-dark">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; 9GAG 2017</p>
      </div>
      <!-- /.container -->
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/popper/popper.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

  </body>

</html>
