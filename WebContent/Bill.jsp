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

	<h1 align="center">---------------------BILL----------------------</h1>
	<%-- <table class="table table-striped table-bordered" align="center">
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
				<td style="font-weight: bold; font-size: 20px; " > Rs <%= b.getTotal() %> </td>
				<td style="font-style: italic; font-size: 20px;"> Rs <%= b.getCgst() %> </td>
				<td style="font-style: italic; font-size: 20px; "> Rs <%= b.getSgst() %> </td>
				<td style="font-weight: bold; font-size: 20px; "> Rs <%= b.getFinalBill() %> </td>
			</tr>
		</tbody>
	</table> --%>


	<div class="row">
		<div class="container" style=" border-radius:5px; width: 400px; height: 400px; box-shadow:  0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);">
			<h3>Price Details : </h3>
			<%-- <h4>Total &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <b><%= b.getTotal() %></b></h4>
			<h4>CGST &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <b><%= b.getCgst() %></b></h4>
			<h4>SGST &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <b><%= b.getSgst() %></b></h4>
			<h4>Final Bill : <b><%= b.getFinalBill() %></b></h4><br> --%>
			<table class="table">
				<tr><td>Bag Total : </td><td style="color: blue; font-weight: bold;"><%= b.getName() %></td></tr>
				<tr><td>Bag Total : </td><td style="color: blue; font-weight: bold;"><%= b.getTotal() %></td></tr>
				<tr><td>CGST : </td><td style="color: blue; font-weight: bold;"><%= b.getCgst() %></td></tr>
				<tr><td>SGST : </td><td style="color: blue; font-weight: bold;"><%= b.getSgst() %></td></tr>
				<tr><td>Final Bill : </td><td style="color: green; font-weight: bold;"><%= b.getFinalBill() %></td></tr>
			</table>
			<a class="btn btn-success right" href="PlaceOrder.jsp">Place the Order</a>
		</div>
	</div>
</body>
</html>
