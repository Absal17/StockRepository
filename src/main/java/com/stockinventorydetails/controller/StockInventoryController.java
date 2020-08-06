package com.stockinventorydetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StockInventoryController {

	@Autowired
	private StockInventoryService stockInventoryService;
	
	@RequestMapping("/stockdetails")
	public List<StockDetails> getAllStockDetails() {
		return stockInventoryService.getAllStockDetails();
	}
	
	@RequestMapping("/stockdetails/{stockName}")
	public StockDetails getTopic(@PathVariable String stockName) {
		return stockInventoryService.getStockDetail(stockName);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/stockdetails")
	public void addTopic(@RequestBody StockDetails stockDetails) {
		stockInventoryService.addStockDetails(stockDetails);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/stockdetails/{stockName}")
	public void updateTopic(@RequestBody StockDetails stockDetails, @PathVariable String stockName) {
		stockInventoryService.updateTopic(stockDetails, stockName);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/stockdetails/{stockName}")
	public void deleteTopic(@PathVariable String stockName) {
		stockInventoryService.deleteTopic(stockName);
	}
}
