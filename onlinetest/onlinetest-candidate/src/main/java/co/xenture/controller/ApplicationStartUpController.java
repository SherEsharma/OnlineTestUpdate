package co.xenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplicationStartUpController {
	
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String showRegistrationForm(){
		
		return "registration";
	}

	
	
}
