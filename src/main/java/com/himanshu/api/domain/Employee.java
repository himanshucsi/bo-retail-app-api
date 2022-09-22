package com.himanshu.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee", schema = "dbo")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id", nullable = false)
	private int empId;
	@Column(name = "name", nullable = true)
	private String name;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "joining_date", nullable = true)
	private String joiningDate;
	@Column(name = "store_id", nullable = true)
	private int storeId;
	@Column(name = "salary", nullable = true)
	private int salary;
	@Column(name = "phone", nullable = true)
	private String phone;

	public Employee() {
		super();
	}

	public Employee(int empId, String name, String email, String joiningDate, int storeId, int salary, String phone) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.joiningDate = joiningDate;
		this.storeId = storeId;
		this.salary = salary;
		this.phone = phone;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + ", joiningDate=" + joiningDate
				+ ", storeId=" + storeId + ", salary=" + salary + ", phone=" + phone + "]";
	}

}
