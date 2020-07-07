package dev.marcosouza.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.marcosouza.store.dto.PurchaseDTO;
import dev.marcosouza.store.model.Purchase;
import dev.marcosouza.store.service.PurchaseService;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
	
	@Autowired
	private PurchaseService purchaseService;
	
	@RequestMapping(method = RequestMethod.POST)
	public Purchase makePurchase(@RequestBody PurchaseDTO purchase) {
		return purchaseService.makePurchase(purchase);
	}
	
}
