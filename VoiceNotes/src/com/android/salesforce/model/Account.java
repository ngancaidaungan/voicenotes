package com.android.salesforce.model;

public class Account {
	
	private String name;
	private String id;  
	
	public Account() { }
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id; 
	}
	
	public String toString() {
		return this.name;
	}
}
