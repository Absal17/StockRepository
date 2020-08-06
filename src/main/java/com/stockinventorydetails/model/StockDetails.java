package com.stockinventorydetails.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_details")
public class StockDetails {
	
	@Id
	@Column(name = "stock_name")
	private String stockName;
	
	@Column(name = "stock_number")
	private int stockNumber;
	
	@Column(name = "purchasing_price")
	private int purchasingPrice;
	
	@Column(name = "purchasing_date")
	private Date purchasingDate;
	
	@Column(name = "quantity")
	private int quantity;
	
	public int getStockNumber() {
		return stockNumber;
	}
	
	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}
	
	public String getStockName() {
		return stockName;
	}
	
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
	public int getPurchasingPrice() {
		return purchasingPrice;
	}
	
	public void setPurchasingPrice(int purchasingPrice) {
		this.purchasingPrice = purchasingPrice;
	}
	
	public Date getPurchasingDate() {
		return purchasingDate;
	}
	
	public void setPurchasingDate(Date purchasingDate) {
		this.purchasingDate = purchasingDate;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
