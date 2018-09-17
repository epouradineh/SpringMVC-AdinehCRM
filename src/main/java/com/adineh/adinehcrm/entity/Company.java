package com.adineh.adinehcrm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Company {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String co_name;
	
	private String co_address;
	
	private String co_email;
	
	private String co_phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCo_name() {
		return co_name;
	}

	public void setCo_name(String co_name) {
		this.co_name = co_name;
	}

	public String getCo_address() {
		return co_address;
	}

	public void setCo_address(String co_address) {
		this.co_address = co_address;
	}

	public String getCo_email() {
		return co_email;
	}

	public void setCo_email(String co_email) {
		this.co_email = co_email;
	}

	public String getCo_phone() {
		return co_phone;
	}

	public void setCo_phone(String co_phone) {
		this.co_phone = co_phone;
	}

	public Company(String co_name, String co_address, String co_email, String co_phone) {
		this.co_name = co_name;
		this.co_address = co_address;
		this.co_email = co_email;
		this.co_phone = co_phone;
	}
	public Company() {
		
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", co_name=" + co_name + ", co_address=" + co_address + ", co_email=" + co_email
				+ ", co_phone=" + co_phone + "]";
	}
	
}
