/**
 * 
 */
package co.xenture.serviceImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import co.xenture.model.StateMaster;
import co.xenture.repo.StateMasterRepo;
import co.xenture.service.StateService;

/**
 * @author Shubham Sharma  Mar 8, 2018  1:52:57 PM
 *
 */
@Service
public class StateServiceImpl implements StateService {
	
	@Autowired
	private StateMasterRepo statemasterrepo;
	
	private Logger log = Logger.getLogger(StateServiceImpl.class.getName());

	/**
	 *  @Purpose
	 *  @author Shubham Sharma  Mar 8, 2018   1:56:33 PM
	 *  @return
	 */
	public List<StateMaster> findAllIndianState(int countryID) {
		log.info("In Services  findAllIndianState"+countryID);
	//	List<StateMaster> list=	 statemasterrepo.findAll();
		List<StateMaster> list=	 statemasterrepo.findAllState(countryID);
		System.out.println(list);
		return list;
	}

}
