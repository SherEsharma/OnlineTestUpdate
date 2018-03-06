package co.xenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.xenture.util.ConstantURL;

@Controller
public class ApplicationStartUpController {
	
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String showRegistrationForm(){
		
		 return ConstantURL.VIEW_REGISTRATION_FORM;
	}

	
	
}
