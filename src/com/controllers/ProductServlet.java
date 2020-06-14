package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
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
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	List<Product> lst;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		lst = new ArrayList<>(); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String check = request.getParameter("productQuantity");
		int checkValue = Integer.parseInt(request.getParameter("productQuantity"));
		if (check==null || checkValue <=0) {
			response.sendRedirect("Error.jsp");
		} 
		else //else if valid then continues//
		{
		PrintWriter out = response.getWriter();
		//Getting values from jsp file//
		int productId = Integer.parseInt(request.getParameter("productId")); 
		String productName = request.getParameter("productName"); 
		int productQuantity = Integer.parseInt(request.getParameter("productQuantity")); 
		double productPrice = Double.parseDouble(request.getParameter("productPrice")); 
		System.out.println("Accepted");
		//Checking if quantity value is invalid//
		

			Product p1 = new Product(productId, productName, productQuantity, productPrice);
			lst.add(p1);
			for (int i = 0; i < lst.size(); i++) {
			System.out.println("-----------------------------");
			System.out.println(lst.get(i).getProductName());
			System.out.println("-----------------------------");
			}
			HttpSession session = request.getSession(true);
			session.setAttribute("products", lst);

			out.println("<html>");
			out.println("<head>");
			out.println("<style>");
			out.println("div{ text-align:center; font-size: 15px;} a{color: white;text-decoration: none;margin-left: 15px; background: #42A5F5;padding: 10px;margin: auto;border-radius: 5px;} "+
			"#items{border: 1px solid #928a8a; font-size: 20px; width: 200px; height: 220px;transform: translate(440px,150px);text-align: center;vertical-align: middle;}");
			out.println("</style>");
			out.println("</head>");
			out.println("<body>");
			out.print("<div id="+"items"+">Do you want to add more product : <hr>"
					+ "<br>");
			out.print("<a href='Product.jsp'> Add more items </a><br><br><br>");
			out.print("<a href='DisplayCart.jsp'> Go to cart </a></div>");
			out.println("</body>");
			out.println("</html>");
		}
	}
		

}



/*System.out.println(lst.contains(p1));
System.out.println(lst.indexOf(p1));
if(lst.contains(p1)) {
	int i = lst.indexOf(p1);
	int oldqnt = lst.get(i).getProductQuantity();
	double oldprice = lst.get(i).getProductPrice();
	int newqnt = oldqnt + productQuantity;
	double newprice = oldprice + productPrice;
	Product p = new Product(productId, productName, newqnt, newprice);
	lst.add(p);
	lst.remove(i);
	System.out.println("i : "+ i);
	System.out.println("oldqnt : "+ oldqnt);
	System.out.println("newqnt : "+ newqnt);
	System.out.println("oldprice : "+ oldprice);
	System.out.println("newprice : "+ newprice);
}
else {
	System.out.println("in else");
	
	lst.add(p1);
}*/







/*//			RequestDispatcher rd = request.getRequestDispatcher("DisplayCart.jsp");
//		session.setAttribute("request", request);
		
		
//		rd.forward(request, response);
//		session.setAttribute("out", out);;
		
//		response.sendRedirect("CartServlet");
*/			