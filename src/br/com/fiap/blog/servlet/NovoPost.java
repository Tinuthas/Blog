package br.com.fiap.blog.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.blog.beans.Post;
import br.com.fiap.blog.dao.PostDAO;

public class NovoPost implements PostInter{
	
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String post = req.getParameter("post");
		
		HttpSession session = req.getSession();
		
		Map<String, Post> posts = new PostDAO().buscaPosts();
		
		req.setAttribute("LISTPOST", posts);
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
		
		
		
		if(session.getAttribute("USUARIO") != null) {
			
			
			
		}else {
			
		}
		
		return null;
	}

}
