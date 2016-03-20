package com.algaworks.cobranca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.cobranca.model.Login;

@Controller
@RequestMapping("/")
public class AutenticaoController {

	@RequestMapping
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("Login");
		mv.addObject(new Login());
		return mv;
	}
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView acessar(Login login){
		ModelAndView mv = new ModelAndView("redirect:/");
		System.out.println(login);
		
		return mv;
	}
}
