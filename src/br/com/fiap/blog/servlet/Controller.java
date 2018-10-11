package br.com.fiap.blog.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String post = req.getParameter("post");

		if (post == null) {
			throw new IllegalArgumentException("Post inexistente");
		}

		post = "br.com.fiap.servlet." + post;

		try {
			Class<?> instancia = Class.forName(post);
			PostInter objeto = (PostInter) instancia.newInstance();
			String pagina = objeto.executa(req, resp);
			RequestDispatcher dispatcher = req.getRequestDispatcher(pagina);
			dispatcher.forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
