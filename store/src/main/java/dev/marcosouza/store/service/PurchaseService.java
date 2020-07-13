package dev.marcosouza.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import dev.marcosouza.store.dto.PurchaseDTO;
import dev.marcosouza.store.dto.SupplierDTO;
import org.springframework.web.client.RestTemplate;

@Service
public class PurchaseService {

	final
	RestTemplate client;

	public PurchaseService(RestTemplate client) {
		this.client = client;
	}

	public void makePurchase(PurchaseDTO purchase) {

		ResponseEntity<SupplierDTO> exchange =
				client.exchange("http://fornecedor:8081/info/" + purchase.getAddress().getUf(),
				HttpMethod.GET, null, SupplierDTO.class);

		System.out.println(exchange.getBody().getAddress());
	}
}

