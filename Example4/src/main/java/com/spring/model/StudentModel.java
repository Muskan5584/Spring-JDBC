package com.spring.model;

public class StudentModel {
	
   //all fields that presents in a table (Student)
   private int id;
   private String name;
   private int contact;
   private int totalMarks;
   private int obtainMarks;
   
     
   
	public StudentModel(int id, String name, int contact, int totalMarks, int obtainMarks) {
	super();
	this.id = id;
	this.name = name;
	this.contact = contact;
	this.totalMarks = totalMarks;
	this.obtainMarks = obtainMarks;
}

	public StudentModel() {
	super();
    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public int getObtainMarks() {
		return obtainMarks;
	}
	public void setObtainMarks(int obtainMarks) {
		this.obtainMarks = obtainMarks;
	}

	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", contact=" + contact + ", totalMarks=" + totalMarks
				+ ", obtainMarks=" + obtainMarks + "]";
	}
    
   
   
}
