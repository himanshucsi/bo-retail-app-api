package com.himanshu.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin", schema = "dbo")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "admin_id", nullable = false)
	private int adminId;

	@Column(name = "name", nullable = true)
	private String name;

	@Column(name = "email", nullable = true)
	private String email;

	@Column(name = "contact", nullable = true)
	private String contact;

	@Column(name = "password", nullable = true)
	private String password;

	@Column(name = "address", nullable = true)
	private String address;

	public Admin() {
		super();
	}

	public Admin(int adminId, String name, String email, String contact, String password, String address) {
		super();
		this.adminId = adminId;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.password = password;
		this.address = address;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", name=" + name + ", email=" + email + ", contact=" + contact
				+ ", password=" + password + ", address=" + address + "]";
	}

}
