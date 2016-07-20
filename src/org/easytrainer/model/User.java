package org.easytrainer.model;

import javax.validation.constraints.Size;

public class User {
	@Size(min=3,max=20)
	private String name;
	@Size(min=10,max=40)
	private String address;
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
