package dev.marcosouza.store.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import dev.marcosouza.store.dto.PurchaseItemDTO;
import dev.marcosouza.store.dto.SupplierDTO;
import dev.marcosouza.store.model.RequestInfoDTO;

@Service
public interface SupplierClient {

	@RequestMapping("info/{uf}")
	SupplierDTO getInfoByUf(@PathVariable String uf);
	
	@RequestMapping(method = RequestMethod.POST, value="/request")
	RequestInfoDTO createRequest(List<PurchaseItemDTO> itens);
	
}
