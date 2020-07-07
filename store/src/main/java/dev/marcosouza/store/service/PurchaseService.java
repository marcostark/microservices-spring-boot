package dev.marcosouza.store.service;

import dev.marcosouza.store.dto.PurchaseDTO;
import dev.marcosouza.store.model.Purchase;

public class PurchaseService {

	public Purchase makePurchase(PurchaseDTO purchase) {
		
		final String uf = purchase.getAddress().getUf();
		
		Purchase purchaseSaved = new Purchase();
		
		return purchaseSaved;
	}


}
