package com.himanshu.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supplier", schema = "dbo")
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "supplierId", nullable = false)
	private int supplierId;
	@Column(name = "name", nullable = true)
	private String name;
	@Column(name = "email", nullable = true)
	private String email;
	@Column(name = "dob", nullable = false)
	private String dob;
	@Column(name = "address", nullable = true)
	private String address;
	@Column(name = "phone", nullable = true)
	private String phone;
	
	
	public Supplier() {
		super();
	}


	public Supplier(int supplierId, String name, String email, String dob, String address, String phone) {
		super();
		this.supplierId = supplierId;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.address = address;
		this.phone = phone;
	}


	public int getSupplierId() {
		return supplierId;
	}


	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", name=" + name + ", email=" + email + ", dob=" + dob
				+ ", address=" + address + ", phone=" + phone + "]";
	}
	
	

}
