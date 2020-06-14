<%@page import="java.util.ArrayList"%>
<%@page import="com.model.Bill"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bill</title>
	<link rel="stylesheet" href="styles.css" type="text/css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body>
	<%!Bill b;%>
	
	<%
		if (!session.isNew()) { 
			b = (Bill) session.getAttribute("bill");
			session.invalidate(); 
		} 
	%>

	<h1 align="center">---------------------BILL------------</h1>
	<table class="table table-striped table-bordered" align="center">
		<thead class="thead-dark">
			<tr>
				<th>
					Total
				</th>
				<th>
					Cgst
				</th>
				<th>
					Sgst
				</th>
				<th>
					FinalBill
				</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td> Rs <%= b.getTotal() %> </td>
				<td> Rs <%= b.getCgst() %> </td>
				<td> Rs <%= b.getSgst() %> </td>
				<td> Rs <%= b.getFinalBill() %> </td>
			</tr>
		</tbody>
	</table>
</body>
</html>