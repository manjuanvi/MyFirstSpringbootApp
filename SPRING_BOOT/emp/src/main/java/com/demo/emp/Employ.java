package com.demo.emp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employ")
public class Employ {
	
	@Id
	private String id;	
	private String name;
	private String address;
	
	public Employ() {		
	}
	
	public Employ(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	

}
