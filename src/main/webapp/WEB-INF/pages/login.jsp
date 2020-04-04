<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Customer Engament Portal | Log in</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Font Awesome -->
  <link rel="stylesheet" href="<%=request.getContextPath() %>/plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- icheck bootstrap -->
  <link rel="stylesheet" href="<%=request.getContextPath() %>/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="<%=request.getContextPath() %>/dist/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">

  <link rel="stylesheet" href="<%=request.getContextPath() %>/dist/css/custom_brand.css">
  <style>
    .bg-img {
      background-image: url(/dist/img/intro-currency.jpg);
      height: 100%;
      background-position: center;
      background-repeat: no-repeat;
      background-size: cover
    }
  </style>
</head>

<body class="hold-transition layout-top-nav">
  <div class="wrapper">

    <!-- Navbar -->
    <nav class="main-header navbar navbar-expand-md navbar-light brand_green_bg">
      <div class="container-fluid">
        <a href="/index3.html" class="navbar-brand">
          <img src="/dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
            style="opacity: .8">
          <span class="brand-text font-weight-light brand_white_txt"><b>Customer Engagement Portal</b></span>
        </a>

        <button class="navbar-toggler order-1" type="button" data-toggle="collapse" data-target="#navbarCollapse"
          aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse order-3" id="navbarCollapse">
          <!-- Left navbar links -->
          <ul class="navbar-nav">
            <li class="nav-item">
              <a href="invoice_summary.html" class="nav-link"><b><i class="fas fa-home brand_white_txt"></i></b></a>
            </li>
            <li class="nav-item">
              <a href="#" class="nav-link font-white "><b class="brand_white_txt">Product & Services</b></a>
            </li>
            <li class="nav-item">
              <a href="#" class="nav-link font-white "><b class="brand_white_txt">Contact Us</b></a>
            </li>
          </ul>
        </div>

        
    </nav>
    <!-- /.navbar -->

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
      <!-- Content Header (Page header) -->
      <div class="content-header">
        <div class="container">
          <div class="row mb-2">
            <div class="col-sm-6 brand_golden_txt">
              <h1>Login </h1>
            </div><!-- /.col -->
            <div class="col-sm-6">
              <ol class="breadcrumb float-sm-right">
                <li class="breadcrumb-item"><a href="#">Home</a></li>
                <li class="breadcrumb-item active">Login Page</li>
              </ol>
            </div><!-- /.col -->
          </div><!-- /.row -->
        </div><!-- /.container-fluid -->
      </div>
      <!-- /.content-header -->

      <!-- Main content -->
      <div class="content login-page bg-img">
        <div class="login-box">
          <div class="login-logo">
            <!-- <a href="/index2.html"><b>Login</b>CEP</a> -->
            
          </div>
          <!-- /.login-logo -->
          <div class="card">
            <div class="card-body login-card-body">
              <p class="login-box-msg"><i class="fas fa-user brand_golden_txt"></i> Sign in to start your session</p>
              
              <form action="<%=request.getContextPath() %>/dashboard" method="post">
                <div class="input-group mb-3">
                  <input type="text" class="form-control" name="user_name">
                  <div class="input-group-append">
                    <div class="input-group-text">
                      <span class="fas fa-envelope"></span>
                    </div>
                  </div>
                </div>
                <div class="input-group mb-3">
                  <input type="password" class="form-control" name="password">
                  <div class="input-group-append">
                    <div class="input-group-text">
                      <span class="fas fa-lock"></span>
                    </div>
                  </div>
                </div>
                <div class="row">
                  <div class="col-8">
                    <div class="icheck-primary">
                      <input type="checkbox" id="remember">
                      <label for="remember">
                        Remember Me
                      </label>
                    </div>
                  </div>
                  <!-- /.col -->
                  <div class="col-4">
                    <button type="submit" class="btn btn-primary btn-block">Sign In</button>
                  </div>
                  <!-- /.col -->
                </div>
              </form>

              <p class="mb-1">
                <a href="forgot-password.html">I forgot my password</a>
              </p>
              <p class="mb-0">
                
              </p>
            </div>
            <!-- /.login-card-body -->
          </div>
        </div>
        <!-- /.login-box -->
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content -->
    <!-- Main Footer -->
    <footer class="main-footer brand_green_bg brand_white_txt">
      <div class="float-right d-none d-sm-block ">
        <b>Version</b> 1.0.0
      </div>
      <strong>&copy; Copyright <a class="brand_golden_txt" href="http://gabhasti.com/">gabhasti.com</a> 2020 </strong>
      All rights
      reserved.
    </footer>
  </div>

  </div>
  <!-- /.content-wrapper -->


  <!-- ./wrapper -->

  <!-- REQUIRED SCRIPTS -->

  <!-- jQuery -->
  <script src="/plugins/jquery/jquery.min.js"></script>
  <!-- Bootstrap 4 -->
  <script src="/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- AdminLTE App -->
  <script src="/dist/js/adminlte.min.js"></script>

</body>

</html>