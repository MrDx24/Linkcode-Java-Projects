<%@page import="com.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<% ArrayList list = (ArrayList)session.getAttribute("products");
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart</title>
	<link rel="stylesheet" href="styles.css" type="text/css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<form action="CartServlet" method="post" id="bill">
	<div >
	<span id="textdata" style="margin-top: 20px" >Click here to proceed further : </span>
	<button class="btn btn-success"  >Proceed to bill</button>
	</div>
</form>

<table class="table table-striped table-bordered">
<thead class="thead-dark">
<tr>
		<th>
			ProductId
		</th>
		<th>
			ProductName
		</th>
		<th>
			ProductQuantity
		</th>
		<th>
			ProductPrice
		</th>
</tr>
</thead>
<tbody>
<% if(list == null) { %>
<tr>
	<td colspan="4" style="text-align: center;">No items in cart</td>
</tr>
<% }else{ %>
<% for (int i = 0; i < list.size() ; i++) { %>
	<tr>
		<% Product p = (Product)list.get(i); %>
		<td><%= p.getProductId() %></td>
		<td><%= p.getProductName() %></td>
		<td><%= p.getProductQuantity() %></td>                  
		<td>Rs <%= p.getProductPrice() %></td>
	</tr>
<% } } %>

</tbody>
</table>


</body>
</html>