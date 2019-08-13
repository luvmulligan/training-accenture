package com.bolsadeideas.springboot.web.app.models;

public class Usuario {
	
	private String Nombre; 
	private String Apellido;
	private String email;
	
	
	public Usuario(String nombre, String apellido, String email) {
		Nombre = nombre;
		Apellido = apellido;
		this.email = email;
	}
	
	
	
	public Usuario() {
	}



	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
	
	

}
