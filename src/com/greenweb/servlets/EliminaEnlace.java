package com.greenweb.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.greenweb.enlace.EnlacesManager;

@WebServlet("/EliminaEnlace")
public class EliminaEnlace extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EnlacesManager m = new EnlacesManager();
		String id= request.getParameter("id");
		System.out.println(id);
		m.eliminaEnlace(id);
		
		
	}
}