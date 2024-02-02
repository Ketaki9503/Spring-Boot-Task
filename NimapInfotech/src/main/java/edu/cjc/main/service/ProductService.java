package edu.cjc.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

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
public class ProductService {

	@Autowired
	ProductRepository pr;
	@Autowired
	categoryRepository cr;

	

	public Product getproductByid(int pid) {
		return pr.findById(pid).get();
	}

	public void saveOrupdate(Product e) {
		    Category c  =   cr.findBycid(e.getC().getCid());
		    e.setC(c);
		 pr.save(e);
		
	}

	public List<Product> getallproducts(int page,int pagesize) {
		Pageable p=PageRequest.of(page, pagesize);
		Page<Product> pageproduct=pr.findAll(p);
		List<Product> bo=pageproduct.getContent();
		System.out.println(bo);
//		pr.findAll().forEach(books1->bo.add(books1));
		
		return bo;
	}

	public void deleteproduct(int pid) {
		pr.deleteById(pid);
		
	}

}
