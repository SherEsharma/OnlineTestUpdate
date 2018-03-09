package co.xenture.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.apache.log4j.Logger;

import co.xenture.model.Registration;
import co.xenture.service.CategoryService;
import co.xenture.service.StateService;
import co.xenture.util.ConstantURL;

@Controller
public class ApplicationStartUpController {
	
	private Logger log = Logger.getLogger(ApplicationStartUpController.class.getName());
	
	@Autowired
	private CategoryService categoryservice;
	

	@Autowired
	private StateService stateservice;
	
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String showRegistrationForm(@ModelAttribute("candidate") Registration registration,Model model){
		
		
		
		
		List categorylist=categoryservice.fetchAllCategory();
		List allFindIndianState=stateservice.findAllIndianState(101);
		
		log.info("Find All Indian State"+allFindIndianState);
		
		model.addAttribute("categorylist", categorylist);
		model.addAttribute("allFindIndiansState",allFindIndianState);
		 return ConstantURL.VIEW_REGISTRATION_FORM;
	}

	
	
}
