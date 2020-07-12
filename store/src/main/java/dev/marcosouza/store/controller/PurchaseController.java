package dev.marcosouza.store.controller;

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

	private final PurchaseService purchaseService;

	public PurchaseController(PurchaseService purchaseService) {
		this.purchaseService = purchaseService;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void makePurchase(@RequestBody PurchaseDTO purchase) {
		purchaseService.makePurchase(purchase);
	}
	
}
