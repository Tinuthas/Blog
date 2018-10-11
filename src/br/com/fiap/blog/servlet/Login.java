package br.com.fiap.blog.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.blog.beans.Usuario;

public class Login implements PostInter{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Usuario u = new Usuario();
		u.setUsuario(req.getParameter("usuario"));
		u.setSenha(req.getParameter("senha"));
		
		
		
		return "index.jsp";
	}
	

}
