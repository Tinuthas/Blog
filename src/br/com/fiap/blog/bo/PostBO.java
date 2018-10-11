package br.com.fiap.blog.bo;

import br.com.fiap.blog.beans.Post;
import br.com.fiap.blog.dao.PostDAO;

public class PostBO {
	
	private final PostDAO dao;
	
	public PostBO() {
		super();
		dao = new PostDAO();
	}
	
	public void adicionaPost (String titulo, String conteudo) {
		if(titulo.isEmpty() || conteudo.isEmpty() || titulo == null || conteudo == null) {
			throw new IllegalArgumentException("É nessário informar o dados corretamente!");
		}
		dao.adicionaPost(new Post(titulo, conteudo));
	}
	
}
