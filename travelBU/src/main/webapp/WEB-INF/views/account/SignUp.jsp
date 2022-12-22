<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>

</style>
<head>
<meta charset="EUC-KR">

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Roboto:wght@500;700&display=swap" rel="stylesheet"> 
    
    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="/resources/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="/resources/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

    <!-- Customized Bootstrap Stylesheet -->
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="/resources/css/style.css" rel="stylesheet">
    <title>[recommendation]-travel site - SingUp</title>
    
</head>

<body>
<div>
<form action = "/account/signup" method="post">
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

    <div class="container-fluid position-relative d-flex p-0">
        <!-- Spinner Start -->
        <div id="spinner" class="show bg-dark position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
            <div class="spinner-border text-primary" style="width: 3rem; height: 3rem;" role="status">
                <span class="sr-only">Loading...</span>
            </div>
        </div>
        <!-- Spinner End -->


        <!-- Sign Up Start -->
        <div class="container-fluid">
            <div class="row h-100 align-items-center justify-content-center" style="min-height: 100vh;">
                <div class="col-12 col-sm-8 col-md-6 col-lg-5 col-xl-4">
                    <div class="bg-secondary rounded p-4 p-sm-5 my-4 mx-3">
                        <div class="d-flex align-items-center justify-content-between mb-3">
                            <a href="index.html" class="">
                                <h3 class="text-primary"><i class="fa fa-user-edit me-2"></i>DarkPan</h3>
                            </a>
                            <h3>Sign Up</h3>
                        </div>

                        <div class="form-floating mb-3">
                            <input type="text" name="USER_ID" class="form-control" id="floatingInput" placeholder="ID">
                            <label for="floatingInput" >ID</label>
                        </div>
                        <div class="form-floating mb-4">
                            <input type="password" name="USER_PASS" class="form-control" id="floatingPassword" placeholder="Password">
                            <label for="floatingPassword">Password</label>
                        </div>
                         <div class="form-floating mb-4">
                            <input type="password" class="form-control" id="floatingPassword" placeholder="CheckPassword">
                            <label for="floatingPassword">Check Password</label>
                        </div>
                         <div class="form-floating mb-3">
                            <input type="text" name="USER_NAME" class="form-control" id="floatingText" placeholder="Username">
                            <label for="floatingText">Username</label>
                        </div>
                         <div class="form-floating mb-3">
                            <input type="text" name="USER_BIRTH" class="form-control" id="floatingText" placeholder="Birthday">
                            <label for="floatingText">예시:000000 생년월일</label>
                        </div>
                     	 <!-- <div class="form-floating mb-3">
							<select class="form-control" id="floatingText" name="USER_SEX">
								<option id="floatingText" id="floatingText" value="none" selected>==선택==</option>
								<option id="floatingText" id="floatingText" value="male">M</option>
								<option id="floatingText"  value="female">F</option>
							</select>
                           
                            <label for="floatingText">성별</label>
                        </div>
                        
 -->                    	 
 						 <div class="form-floating mb-3">
                       
                            
							<select name="USER_SEX" class="form-control" id="floatingText">
									<option value="none" selected>==선택==</option>
									<option value="M">M</option>
									<option value="F">F</option>
								</select>
                            <label for="floatingText">성별</label>
                        </div>
 						<div class="form-floating mb-3">
                            <input  type="email" name="USER_EMAIL" class="form-control" id="floatingText" placeholder="email">
                            <label for="floatingText">email</label>
                        </div>                        
                    	 <div class="form-floating mb-3">
                            <input type="text" name="USER_PHONE" class="form-control" id="floatingText" placeholder="Phone Number">
                            <label for="floatingText">Phone Number</label>
                        </div>
                     
                     
                     
                        <button type="submit" class="btn btn-primary py-3 w-100 mb-4">Sign Up</button>
                        <p class="text-center mb-0">Already have an Account? <a href="">Sign In</a></p>
                    </div>
                </div>
            </div>
        </div>
        <!-- Sign Up End -->
    </div>

    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="/resources/lib/chart/chart.min.js"></script>
    <script src="/resources/lib/easing/easing.min.js"></script>
    <script src="/resources/lib/waypoints/waypoints.min.js"></script>
    <script src="/resources/lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="/resources/lib/tempusdominus/js/moment.min.js"></script>
    <script src="/resources/lib/tempusdominus/js/moment-timezone.min.js"></script>
    <script src="/resources/lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

    <!-- Template Javascript -->
   <script src="/resources/js/main.js"></script>
   </form>
   </div>
</body>

</html>