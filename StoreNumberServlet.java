package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Contact;
import com.dao.ContactDetails;

public class StoreNumberServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name1=req.getParameter("name1");
		long number1=Long.parseLong(req.getParameter("numb1"));
		
		String name2=req.getParameter("name2");
		long number2=Long.parseLong(req.getParameter("numb2"));
		
		String name3=req.getParameter("name3");
		long number3=Long.parseLong(req.getParameter("numb3"));
		
		ContactDetails cd = ContactDetails.object();
		cd.addContact(name1, number1);
		cd.addContact(name2, number2);
		cd.addContact(name3, number3);
	
	}

}
