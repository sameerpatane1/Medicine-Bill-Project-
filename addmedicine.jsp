<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
 <link rel="stylesheet" href="CSS/adminstyle.css">
</head>
<body>

   <div class="container">
   <div class="row">
    <div class="col-12-md m-auto">
        <form class="dropdown" name="frm" action="newmedicine" method="post">
            <div class="form-group">
            <br>
           
                <label for="exampleInputEmail1 m-auto"  ><b>Company Name<b></label>
                <br>                           
                <input type="text" class="form-control control" name="companyName"
                       id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter company names">
                <br/>
            </div>
            
            <button type="submit" class="btn btn-primary">Add Company Names</button>
           
        </form>
    </div>
    </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
    crossorigin="anonymous"></script>
</body>
</html>
