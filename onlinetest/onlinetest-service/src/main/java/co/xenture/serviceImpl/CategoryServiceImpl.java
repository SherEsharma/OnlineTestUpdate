package co.xenture.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import co.xenture.model.Categories;
import co.xenture.service.CategoryService;

@Service("categoryservice")
public class CategoryServiceImpl implements CategoryService {

	/**
	 * Purpose 
	 *  @author Shubham Sharma  Mar 7, 2018   11:06:20 AM
	 *  @return  List of category
	 */
	public List<Categories> fetchAllCategory() {
		List  list = new ArrayList();
		list.add("shubam");
		list.add("preeti");
		list.add("pooja");
		return list;
	}



	


}
