package com.stockinventorydetails.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface StockInventoryService {

	public List<StockDetails> getAllStockDetails();

	public void addStockDetails(StockDetails stockDetails);

	public void updateStockDetails(StockDetails stockDetails, String stockName);

	public void deleteStockDetails(StockDetails stockDetails,String stockName);

	public StockDetails getStockDetail(String stockName);

}
