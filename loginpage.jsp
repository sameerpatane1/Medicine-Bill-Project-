<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/adminstyle.css">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
 <br><br>
 <form action="LoginController" method="post">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-4" id="s"></div>
            <div class="col-md-5" id="p">
                <section style="margin-top: -70px; background-color: darkmagenta; border-radius: 20px; color: aqua; text-align: center;">Admin Login</section>
                <pre></pre>
                <input type="text" name="emailid" value="" placeholder="Enter Email Id" style="text-align: center; margin-left: 90px; border-radius: 10px;"><br><br>
                <input type="password" name="password" value="" placeholder="Enter Password" style="text-align: center; margin-left: 90px; border-radius: 10px;"> <br> <br>
                <input type="checkbox" name="n" value="" style="margin-left: 90px;"><a href="email.com" style="color: yellow">Forgot Password</a><br><br>
                <input type="submit" name="button" value="Login" style="margin-left: 90px; width: 200px; border-radius: 10px; background-color: chartreuse;">
                
            </div>
        </div>
    </div>
     
</form>

    <!-- second form -->
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>