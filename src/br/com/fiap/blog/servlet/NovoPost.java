package br.com.fiap.blog.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NovoPost implements PostInter{
	
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String post = req.getParameter("post");
		
		HttpSession session = req.getSession();
		
		if(session.getAttribute("USUARIO") != null) {
			
			
			
		}else {
			
		}
		
		return null;
	}

}
