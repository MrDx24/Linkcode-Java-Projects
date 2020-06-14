package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Bill;
import com.model.Product;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//	List<Bill> bills;
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
//    public void init(ServletConfig config) throws ServletException {
//		// TODO Auto-generated method stub
//    	
//    	bills = new ArrayList<>();
//		
//	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession(true);
		ArrayList<Product> products =  new ArrayList<>();

		products = (ArrayList)session.getAttribute("products");
		System.out.println("In CartServlet : "+products.get(0).getProductName());
		double total=0,gst,finalTotal;
//		List<Product> lst=(List<Product>) session.getAttribute("shop");
		for(Product p:products){
			total=total+(p.getProductPrice()*p.getProductQuantity());
		}
		gst=total*0.12;
		finalTotal=gst+total;
		
		Bill b=new Bill(total, gst, gst, finalTotal);
		session.setAttribute("bill",b);
//		RequestDispatcher rd = request.getRequestDispatcher("Bill.jsp");
//		request.setAttribute("bill",b);
//		rd.forward(request, response);
		response.sendRedirect("Bill.jsp");
		
		

	}

}









/*for(Product p : products)
{
	double total = p.getProductPrice() * p.getProductQuantity();
	double cgst= total*0.09, sgst = total*0.09;
	double finalBill = total+cgst+sgst;
	
	Bill bill = new Bill(total,cgst,sgst,finalBill);
	bills.add(bill); 
	
	
}

PrintWriter out = response.getWriter();
out.println("<html>");
out.println("<head>");
out.println("</head>");
out.println("<body>");
out.println("<table>");
out.println("<th> ProductId </th>" );
out.println("<th> ProductName </th>" );
out.println("<th> ProductQuantity </th>" );
out.println("<th> ProductPrice </th>" );
for (Product p : products) {
	out.println("<tr><td> "+p.getProductId()+" </td>" );
	out.println("<td> "+p.getProductName()+" </td>" );
	out.println("<td> "+p.getProductQuantity()+" </td>" );
	out.println("<td> "+p.getProductPrice()+" </td></tr>" );
}
out.println("</table>");
out.println("</body>");
out.println("</html>");

//		List<Bill> bills = new ArrayList<>();
		double total=0,gst = 0,finalTotal = 0;
		Bill b = null;
//		List<Product> lst=(List<Product>) session.getAttribute("shop");
		for(Product p: products){
			total=total+(p.getProductPrice()*p.getProductQuantity());
			gst=total*0.12;
			finalTotal=gst+total;
			b=new Bill(total, gst, gst, finalTotal);
			
		}
		bills.add(b);
		System.out.println(bills.get(0));
		RequestDispatcher rd = request.getRequestDispatcher("Bill.jsp");
		request.setAttribute("bill",bills);
//		response.sendRedirect("Bill.jsp");
		
//		
		request.setAttribute("products", products);
//		response.sendRedirect("DisplayCart.jsp");
		rd.forward(request, response);
		
		
*/