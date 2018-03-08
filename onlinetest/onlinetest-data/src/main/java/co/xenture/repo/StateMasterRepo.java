/**
 * 
 */
package co.xenture.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.xenture.model.StateMaster;

/**
 * @author Shubham Sharma  Mar 8, 2018  5:03:56 PM
 *
 */
public interface StateMasterRepo extends JpaRepository<StateMaster, Integer> {
	
	@Query("from StateMaster state where state.countryId=?1")
	 List<StateMaster> findAllState(int countryID);

}
