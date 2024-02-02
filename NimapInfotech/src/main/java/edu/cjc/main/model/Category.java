package edu.cjc.main.model;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.query.sqm.tree.from.DowncastLocation;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Entity
public class Category {
	@Id
	private int cid;
	private String ctype;
	private String cname;

//	@JsonBackReference
//
//@OneToMany(cascade = {CascadeType.DETACH})
//@JoinColumn(name = "cid")
//
//private List<Product> products=new ArrayList<>();
//	

	public int getCid() {
		return cid;
	}







//
//	public List<Product> getProducts() {
//		return products;
//	}
//
//
//
//
//
//
//
//
//	public void setProducts(List<Product> products) {
//		this.products = products;
//	}








	public void setCid(int cid) {
		this.cid = cid;
	}

	
	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	

	
}
