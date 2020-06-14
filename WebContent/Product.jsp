<%@page import="com.model.ProductDetails"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.LSTORE"%>
<%@page import="java.util.ArrayList"%>
<%@page errorPage="Error.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
	<link rel="stylesheet" href="styles.css" type="text/css">
</head>
<body>

<%!int size = 0 ; %>
<%!int data = 0; %>
<% ArrayList lst = (ArrayList)session.getAttribute("products"); %>
<% if(lst==null) {size = 0;}else{size = lst.size();} %>

	<nav class="navbar navbar-inverse fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">WebSiteName</a>
			</div>

			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-list-alt"></span>History </a></li>
				<li><a href="DisplayCart.jsp"><span class="glyphicon glyphicon-shopping-cart"></span> Cart </a>
				<span class="badge"><%= size %></span></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>Logout </a></li>
			</ul>
		</div>
	</nav>

	<div class="row">
	<h2 style="text-align: center;">Stationary Products</h2> <hr> 
	<%! ProductDetails pd = new ProductDetails(); %>
	<% for(int i=0; i<8;i++) { %>
		<div class="row cont">
			<form action="ProductServlet" method="post" class="formGroup ">
				<div class="formGroup">
					<label for="productId">Product Id</label><br> 
					<input id="productId" class="form-control" type="text" name="productId" value=<%= pd.pid[i] %> readonly>
	
					<label for="productName">Product Name</label><br> 
					<input id="productName" class="form-control" type="text" name="productName"  value=<%= pd.pnames[i] %> readonly> 
						
					<label id="prQtlbl" for="productQuantity">Product Quantity</label><br> 
					<input id="productQuantity" class="form-control" type="number" name="productQuantity" required="required"> 
					
					<label id="ptprlbl" for="productPrice">Product Price</label> 
					<input id="productPrice" class="form-control" type="text" name="productPrice"  value=<%= pd.pprice[i] %> readonly>
					
					<button type="submit" class="btn btn-block btn-primary" >Add item to cart</button>
					<!--  <a type="submit" class="btn btn-block btn-primary" href="DisplayCart.jsp" >Go to Cart</a>-->
					<%-- <%!String str=null; %>
					<% if(lst==null) { 
						str = "No products in cart"; 
						%>
					<% } else { str = String.valueOf(lst.size()) + " products added to cart"; %> --%>
					
					<%-- <div class="items" class="btn btn-block btn-secondary" ><i class="fa fa-shopping-cart"></i> <%= str %> </div> --%>
					
					<%-- <% } %> --%>
					<%-- <%  data = (int)request.getParameter("productQuantity");   %> --%>
				</div>
	
			</form>
	
		</div>
		<% } %>
	</div>



</body>
</html>