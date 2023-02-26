package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	
	private int rollnum;
	private String name;
	private String branch;
	private String contactNo;
	private String city;
	
	@Id
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollnum=" + rollnum + ", name=" + name + ", branch=" + branch + ", contactNo=" + contactNo
				+ ", city=" + city + "]";
	}

	
	
}
