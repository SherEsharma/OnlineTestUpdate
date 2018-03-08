package co.xenture.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import co.xenture.model.Categories;
import co.xenture.repo.CategoryRepo;
import co.xenture.service.CategoryService;

@Service("categoryservice")
public class CategoryServiceImpl implements CategoryService {
	


	
	@Autowired
	private CategoryRepo categoryrepo;
	
	/**
	 * Purpose 
	 *  @author Shubham Sharma  Mar 7, 2018   11:06:20 AM
	 *  @return  List of category
	 */
	public List<Categories> fetchAllCategory() {
		List<Categories> list=categoryrepo.findAll();
		list.remove(0);
		return list;
	}



	


}
