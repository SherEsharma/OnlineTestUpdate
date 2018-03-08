/**
 * 
 */
package co.xenture.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.xenture.model.Categories;

/**
 * @author Shubham Sharma  Mar 7, 2018  2:31:58 PM
 *
 */
public interface CategoryRepo  extends JpaRepository<Categories, Integer> {

	
}
