package com.saman;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ml")
public class AnotherServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		int result = (int) session.getAttribute("result");
//		int result = Integer.parseInt(request.getParameter("result"));
		
//		Cookie cookies[] =request.getCookies();
//		
//		for(Cookie c:cookies) {
//			if(c.getName().equals("result")) {
//				int result1 = Integer.parseInt(c.getValue());
//			}
//		}
//		int result = (int) request.getAttribute("result");
		int data = result*2;
		PrintWriter out= response.getWriter();
		out.print("The result is: "+data);
	}

}
