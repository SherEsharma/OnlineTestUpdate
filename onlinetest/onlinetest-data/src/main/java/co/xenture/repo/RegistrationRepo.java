/**
 * 
 */
package co.xenture.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import co.xenture.model.Registration;

/**
 * @author Shubham Sharma  Mar 8, 2018  1:01:00 PM
 *
 */
public interface RegistrationRepo extends JpaRepository<Registration, Integer> {

}
