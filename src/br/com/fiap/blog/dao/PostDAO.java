package br.com.fiap.blog.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.fiap.blog.beans.Post;

public class PostDAO {
	
	public static final Map<String, Post> POSTS = new HashMap<>();
	static {
		POSTS.put("Post 1", new Post("Titulo", "Conteudo"));
		POSTS.put("Post 2", new Post("Titulo", "Conteudo"));
		POSTS.put("Post 3", new Post("Titulo", "Conteudo"));
	}
	
	public Map<String, Post> buscaPosts() {
		
		return POSTS;
	}
	
	public void adicionaPost(Post p) {
		POSTS.put(p.getTitulo(), p);
	}
	
 
}
