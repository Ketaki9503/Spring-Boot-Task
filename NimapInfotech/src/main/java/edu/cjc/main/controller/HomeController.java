package edu.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.cjc.main.model.Category;
import edu.cjc.main.model.Product;
import edu.cjc.main.service.CategoryService;
import edu.cjc.main.service.ProductService;

@RestController
public class HomeController {

	@Autowired
	CategoryService cs;
	@Autowired
	ProductService ps;
	
	
	
	@GetMapping("/api/categories")
	public List<Category> getallcategory(@RequestParam (value = "page",defaultValue = "0",required = false)Integer page){
		
		return cs.getallcategory(page,1);
	}
	
	
	
	@DeleteMapping("/api/categories/{di}")
	public void deleteEmployee(@PathVariable("di") int cid) {
		cs.deleteEmployee(cid);
	
	}
	@GetMapping("/api/categories/{di}")
	public Category getcategory(@PathVariable("di") int cid) {
		return cs.getcategoryByid(cid);
		
	}
	 
	@PutMapping("/api/categories/{di}")
	public void update(@RequestBody Category e){
	
		cs.saveOrupdate(e);
		
		
	}
	@PostMapping("/api/categories")
	public void saveCategories(@RequestBody Category e) {
		
		cs.saveOrupdate(e);
	}
	@GetMapping("/api/products")
	public List<Product> getallproduct(@RequestParam(value = "page",defaultValue = "0",required = false)Integer page){
		return ps.getallproducts(page,1);
	}
	
	@DeleteMapping("/api/products/{di}")
	public void deleteProduct(@PathVariable("di") int pid) {
		ps.deleteproduct(pid);
	
	}
	@GetMapping("/api/products/{di}")
	public Product getproduct(@PathVariable("di") int pid) {
		return ps.getproductByid(pid);
		
	}
	 
	@PutMapping("/api/products/{di}")
	public void updatep(@RequestBody Product e){
		ps.saveOrupdate(e);
		
		
	}
	@PostMapping(value = "/api/products",consumes = "application/json")
	public void saveProducts(@RequestBody Product p) {
		ps.saveOrupdate(p);
	}
	
}
