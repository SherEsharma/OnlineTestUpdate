/**
 * 
 */
package co.xenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Shubham Sharma  Mar 8, 2018  12:36:15 PM
 *
 */
@Controller
public class CandidateRegistrationController {

	
	@RequestMapping(value="", method=RequestMethod.POST)
	public String registrationProcess(){
		
		return null;
	}
	
}
