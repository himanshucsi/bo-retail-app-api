package com.himanshu.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "complaint", schema = "dbo")
public class Complaint {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "complaint_id", nullable = false)
	private int complaintId;
	@Column(name = "store_id", nullable = true)
	private int storeId;
	@Column(name = "product_id", nullable = true)
	private int productId;
	@Column(name = "description", nullable = true)
	private String description;
	@Column(name = "complaint_date", nullable = true)
	private String complaintDate;
	@Column(name = "customer_email", nullable = true)
	private String customerEmail;

	public Complaint() {
		super();
	}

	public Complaint(int complaintId, int storeId, int productId, String description, String complaintDate,
			String customerEmail) {
		super();
		this.complaintId = complaintId;
		this.storeId = storeId;
		this.productId = productId;
		this.description = description;
		this.complaintDate = complaintDate;
		this.customerEmail = customerEmail;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getComplaintDate() {
		return complaintDate;
	}

	public void setComplaintDate(String complaintDate) {
		this.complaintDate = complaintDate;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	@Override
	public String toString() {
		return "Complaint [complaintId=" + complaintId + ", storeId=" + storeId + ", productId=" + productId
				+ ", description=" + description + ", complaintDate=" + complaintDate + ", customerEmail="
				+ customerEmail + "]";
	}

}
