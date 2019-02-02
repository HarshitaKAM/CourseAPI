package com.example.demo;
//this is model 

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id    //primary key
	private String id; 
	
	private String name, description;
	public Topic()
	{
		
	}
	public Topic(String id, String name, String description)
	{
		super();
		this.id=id;
		this.description=description;
		this.name=name;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
 
}
