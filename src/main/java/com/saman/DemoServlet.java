package com.saman;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;

@WebServlet("/add")
public class DemoServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		int number1 = Integer.parseInt(request.getParameter("num1"));
		int number2 = Integer.parseInt(request.getParameter("num2"));
		int result= number1+number2;
		System.out.println(result);
		PrintWriter out = response.getWriter();
		out.print(result);
		
//		request.setAttribute("result", result);
//		RequestDispatcher rd= request.getRequestDispatcher("ml");
//		rd.forward(request,response);
		
		HttpSession session  = request.getSession();
		session.setAttribute("result", result);
		
		Cookie cookie = new Cookie("result",result+"");
		response.addCookie(cookie);

		response.sendRedirect("ml");
	}
}
