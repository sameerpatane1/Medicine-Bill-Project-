<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="org.medicinepharma.admin.service.*,java.util.*,org.medicinepharma.admin.model.* "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<%!RetailerService rService = new RetailerServiceImpl();%>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Sr No</th>
				<th scope="col">RetId</th>
				<th scope="col">RetailerDetails</th>
				<th scope="col">Contact
				<th scope="col">Address
				<th scope="col">Email
				<th scope="col">Delete</th>
				<th scope="col">Update</th>
			</tr>
		</thead>
		<tbody>
		<tbody>
			<%
			List<RetailerModel> list = rService.getAllRetailer();
			int count = 0;
			for (RetailerModel rm : list) {
			%>
			<tr>
				<th scope="row"><%=++count%></th>
				<td><%=rm.getRetId()%></td>
				<td><%=rm.getRetName()%></td>
				<td><%=rm.getContact()%></td>
				<td><%=rm.getAddress()%></td>
				<td><%=rm.getEmail()%></td>
				<td><a href='delt?retid=<%=rm.getRetId() %>'>Delete</a></td>
                <td><a href='RetailerUpdateController?retid=<%=rm.getRetId()%>&retname=<%=rm.getRetName()%>&contact=<%=rm.getContact()%> &address=<%=rm.getAddress()%>&email=<%=rm.getEmail()%>'>Update</a></td>
	 
		 
			</tr>
			<%
			}
			%>

		</tbody>
	</table>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>