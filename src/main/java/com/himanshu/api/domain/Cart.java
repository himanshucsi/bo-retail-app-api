package com.himanshu.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart", schema = "dbo")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_id", nullable = false)
	private int cartId;
	@Column(name = "name", nullable = true)
	private String name;
	@Column(name = "email", nullable = true)
	private String email;
	@Column(name = "product_id", nullable = true)
	private int productId;
	@Column(name = "quantity", nullable = true)
	private int quantity;
	@Column(name = "total_price", nullable = true)
	private int totalPrice;
	@Column(name = "store_id", nullable = true)
	private int storeId;

	public Cart() {
		super();
	}

	public Cart(int cartId, String name, String email, int productId, int quantity, int totalPrice, int storeId) {
		super();
		this.cartId = cartId;
		this.name = name;
		this.email = email;
		this.productId = productId;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.storeId = storeId;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
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

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", name=" + name + ", email=" + email + ", productId=" + productId
				+ ", quantity=" + quantity + ", totalPrice=" + totalPrice + ", storeId=" + storeId + "]";
	}

}
