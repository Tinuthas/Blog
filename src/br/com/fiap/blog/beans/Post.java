package br.com.fiap.blog.beans;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
	private String titulo;
	private String conteudo;
	private Date dataCriacao;
	public Post(String titulo, String conteudo) {
		super();
		this.titulo = titulo;
		this.conteudo = conteudo;
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
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public String getDataCriacaoFormatada() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		return df.format(dataCriacao);
	}
	

}
