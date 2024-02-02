package edu.cjc.main.service;


import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import edu.cjc.main.model.Category;
import edu.cjc.main.model.Product;
import edu.cjc.main.repository.ProductRepository;
import edu.cjc.main.repository.categoryRepository;

@Service
public class CategoryService {

	@Autowired
	categoryRepository cr;
	@Autowired
	ProductRepository pr;
	
	public List<Category> getallcategory(int page,int pagesize) {
		System.out.println("in service");
		Pageable p=PageRequest.of(page,pagesize);
		Page<Category> pageCategory=cr.findAll(p);
		List<Category> bo=pageCategory.getContent();
		
		//cr.findAll().forEach(books1->bo.add(books1));
		
		return bo;
	}

	public void deleteEmployee(int cid) {
		cr.deleteById(cid);
		
	}

	public void saveOrupdate(Category e) {
		
			  cr.save(e);
		  
		}
		               
		
		
		

	public Category getcategoryByid(int cid) {
		return cr.findById(cid).get();
		
	}

	

	

	

}
