/**
 * 
 */
package co.xenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.xenture.model.Registration;

/**
 * @author Shubham Sharma  Mar 8, 2018  12:36:15 PM
 *
 */
@Controller
public class CandidateRegistrationController {

	
	@RequestMapping(value="/registationprocss", method=RequestMethod.POST)
	public String registrationProcess(@ModelAttribute("candidate") Registration registration,Model model){
		
		return null;
	}
	
}
