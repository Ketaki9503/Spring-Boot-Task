package edu.cjc.main.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Product {

@Id
private int pid;
private String ptype;
private int pprice;


@ManyToOne(cascade = CascadeType.ALL)
private Category c;

public int getPid() {
	return pid;
}
public Category getC() {
	return c;
}
public void setC(Category c) {
	this.c = c;
}
public void setPid(int pid) {
	this.pid = pid;
}


public String getPtype() {
	return ptype;
}
public void setPtype(String ptype) {
	this.ptype = ptype;
}
public int getPprice() {
	return pprice;
}
public void setPprice(int pprice) {
	this.pprice = pprice;
}

}
