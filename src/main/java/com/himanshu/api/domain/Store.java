package com.himanshu.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "store", schema = "dbo")
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "store_id", nullable = false)
	private int storeId;
	@Column(name = "state", nullable = true)
	private String state;
	@Column(name = "city", nullable = true)
	private String city;
	@Column(name = "road_no", nullable = true)
	private String roadNo;
	@Column(name = "store_license_no", nullable = false)
	private String storeLicenseNo;

	public Store() {
		super();
	}

	public Store(int storeId, String state, String city, String roadNo, String storeLicenseNo) {
		super();
		this.storeId = storeId;
		this.state = state;
		this.city = city;
		this.roadNo = roadNo;
		this.storeLicenseNo = storeLicenseNo;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRoadNo() {
		return roadNo;
	}

	public void setRoadNo(String roadNo) {
		this.roadNo = roadNo;
	}

	public String getStoreLicenseNo() {
		return storeLicenseNo;
	}

	public void setStoreLicenseNo(String storeLicenseNo) {
		this.storeLicenseNo = storeLicenseNo;
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", state=" + state + ", city=" + city + ", roadNo=" + roadNo
				+ ", storeLicenseNo=" + storeLicenseNo + "]";
	}

}
