/**
 * 
 */
package co.xenture.service;

import java.util.ArrayList;
import java.util.List;

import co.xenture.model.StateMaster;

/**
 * @author Shubham Sharma  Mar 8, 2018  1:51:34 PM
 *
 */
public interface StateService {
	
	List<StateMaster>  findAllIndianState(int countryID);

}
