package com.himanshu.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products", schema = "dbo")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id", nullable = false)
	private int productId;
	@Column(name = "store_id", nullable = true)
	private String storeId;
	@Column(name = "expiry_date", nullable = true)
	private String expiryDate;
	@Column(name = "price", nullable = true)
	private String price;
	@Column(name = "supplier_id", nullable = true)
	private String supplierId;
	@Column(name = "category", nullable = true)
	private String category;

	public Products() {
		super();
	}

	public Products(int productId, String storeId, String expiryDate, String price, String supplierId,
			String category) {
		super();
		this.productId = productId;
		this.storeId = storeId;
		this.expiryDate = expiryDate;
		this.price = price;
		this.supplierId = supplierId;
		this.category = category;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", storeId=" + storeId + ", expiryDate=" + expiryDate + ", price="
				+ price + ", supplierId=" + supplierId + ", category=" + category + "]";
	}

}
