package com.algaworks.cobranca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.cobranca.model.Usuario;

@Controller
@RequestMapping("/users")
public class UsuarioController {
	
	@RequestMapping("/new")
	public ModelAndView novo(){
		ModelAndView mv = new ModelAndView("CadastroUsuario");
		mv.addObject(new Usuario());
		return mv;
	}
	
}
