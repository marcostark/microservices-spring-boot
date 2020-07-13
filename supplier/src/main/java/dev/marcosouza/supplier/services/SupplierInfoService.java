package dev.marcosouza.supplier.services;

import dev.marcosouza.supplier.model.SupplierInfo;
import dev.marcosouza.supplier.repository.SupplierInfoRepository;
import org.springframework.stereotype.Service;

@Service
public class SupplierInfoService {

    private final SupplierInfoRepository supplierInfoRepository;

    public SupplierInfoService(SupplierInfoRepository supplierInfoRepository) {
        this.supplierInfoRepository = supplierInfoRepository;
    }

    public SupplierInfo getInfoByState(String state) {
        return supplierInfoRepository.findByState(state);
    }

}
