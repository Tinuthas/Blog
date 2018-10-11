package br.com.fiap.blog.beans;

public class Post {
	private String titulo;
	private String noticia;
	public Post(String titulo, String noticia) {
		super();
		this.titulo = titulo;
		this.noticia = noticia;
	}
	public Post() {
		super();
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getNoticia() {
		return noticia;
	}
	public void setNoticia(String noticia) {
		this.noticia = noticia;
	}
	
	

}
