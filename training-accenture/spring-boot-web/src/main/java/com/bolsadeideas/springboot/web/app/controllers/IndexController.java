package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.Map;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bolsadeideas.springboot.web.app.models.Usuario;


@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index", "/home", "/", ""})
	public String index(Model model) {
		
		model.addAttribute("titulo", "hola Spring Framework!");
		return "index";
	}
	
	@RequestMapping ("/perfil")
	public String perfil (Model model) {
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Andrés");
		usuario.setApellido("Guzmán");
		usuario.setEmail("andres@correo.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del Usuario: ".concat(usuario.getNombre()));
		return "perfil";
	}
	
	@RequestMapping("/listado")
	public String listar (Model model) {
		
		List<Usuario> usuarios = Arrays.asList(new Usuario ("Andres", "Guzmán", "andres@correo.com"),		
		new Usuario("John", "Doe", "john@correo.com"),
		new Usuario("Jane", "Doe", "jane@correo.com"),
		new Usuario("Tornado", "Roe", "roe@correo.com")
		);
		
	model.addAttribute("titulo", "Listado de usuarios");
	model.addAttribute("usuarios", usuarios);
		return "listado";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		
		List<Usuario> usuarios = Arrays.asList(new Usuario ("Andres", "Guzmán", "andres@correo.com"),		
				new Usuario("John", "Doe", "john@correo.com"),
				new Usuario("Jane", "Doe", "jane@correo.com"),
				new Usuario("Tornado", "Roe", "roe@correo.com")
				);
		
		return usuarios;
	}
	
	

}
