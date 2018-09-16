package com.ecodeup.mvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class ControllerEjemplo {
	
	@RequestMapping(method=RequestMethod.GET)
	public String procesarHome(ModelMap model) {
		model.addAttribute("mensaje", "Esto es un mensaje desde ControllerEjemplo");
		return "vista1";
	}
	
	@RequestMapping(value="/spring",method=RequestMethod.GET)
	public String procesarPeticion(Map<String, Object> map) {
		map.put("mensaje", "Hola Spring!!");
		return "vista2";
	}
	
	@RequestMapping(value="/springmvc",method=RequestMethod.GET)
	public ModelAndView procesarPeticion() {
		ModelAndView model = new ModelAndView("vista3");
		model.addObject("mensaje", "Hola Spring MVC!!");
		return model;
	}	

}
