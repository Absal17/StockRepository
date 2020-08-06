package com.stockinventorydetails.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StockInventoryServiceImpl implements StockInventoryService {
	
	@Autowired
	private StockInventoryDao stockinventoryDao;

	@Override
	public List<StockDetails> getAllStockDetails() {
		List<StockDetails> stockDetails= new ArrayList<StockDetails>();
		stockinventoryDao.findAll().forEach(stockDetails::add);
		return stockDetails;
	}

	@Override
	public void addStockDetails(StockDetails stockDetails) {
		stockinventoryDao.save(stockDetails);
		
	}

	@Override
	public void updateStockDetails(StockDetails stockDetails, String stockName) {
		if(stockDetails.getQuantity() != 0) {
		    stockinventoryDao.save(stockDetails);
		} else {
			deleteStockDetails(stockDetails, stockName);
		}
	}

	@Override
	public void deleteStockDetails(StockDetails stockDetails,String stockName) {
		if(stockDetails.getQuantity() == 0) {
			stockinventoryDao.delete(stockDetails);
		}
	}

	@Override
	public StockDetails getStockDetail(String stockName) {
		return stockinventoryDao.findOne(stockName);
	}

}
