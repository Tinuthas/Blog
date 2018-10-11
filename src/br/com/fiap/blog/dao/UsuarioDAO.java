package br.com.fiap.blog.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.fiap.blog.beans.Usuario;

public class UsuarioDAO {
	
	public static final Map<String, Usuario> USUARIOS = new HashMap<>();
	static {
		USUARIOS.put("usuario", new Usuario("usuario","usuario"));
		USUARIOS.put("contato", new Usuario("contato","contato"));
		USUARIOS.put("admin", new Usuario("admin","admin"));
		
	}
	
}
