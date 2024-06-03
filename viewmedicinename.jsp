<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="org.medicinepharma.admin.service.*,java.util.*,org.medicinepharma.admin.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<%!
MedicineService medicineservice=new MedicineServiceImpl();
%>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Sr.No</th>
      <th scope="col">Company Name</th>
      <th scope="col">Delete</th>
      <th scope="col">update</th>
    </tr>
  </thead>
  <tbody>
  <%
  List<MedicineModel>list=medicineservice.getAllCompanyName();
  int count=0;
  for(MedicineModel m:list){
	  %>  
   <tr>
   <th scope="row"><%=++count%></th>
   <td><%=m.getCompanyName() %></td>
   <td><a href='del?companyId=<%= m.getCompanyId() %>'>Delete</a></td><!-- companyId(used in model)and getCompanyId also in model -->
  <td><a href='UpdateController?companyId=<%=m.getCompanyId() %>&companyName=<%=m.getCompanyName() %>'>Update</a></td>
   </tr>
  <%
  }
  %>
   
   
  </tbody>
</table>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>