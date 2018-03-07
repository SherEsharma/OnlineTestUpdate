package co.xenture.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.xenture.service.CategoryService;
import co.xenture.util.ConstantURL;

@Controller
public class ApplicationStartUpController {
	
	@Autowired
	private CategoryService categoryservice;
	
	
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String showRegistrationForm(){
		List list=categoryservice.fetchAllCategory();
		System.out.println(list);
		 return ConstantURL.VIEW_REGISTRATION_FORM;
	}

	
	
}
