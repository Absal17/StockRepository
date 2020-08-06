package com.stockinventorydetails.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface StockInventoryService {

	public List<StockDetails> getAllStockDetails();

	public void addStockDetails(StockDetails stockDetails);

	public void updateTopic(StockDetails stockDetails, String id);

	public void deleteTopic(String id);

	public StockDetails getStockDetail(String stockName);

}
