package dev.marcosouza.supplier.controller;

import dev.marcosouza.supplier.model.SupplierInfo;
import dev.marcosouza.supplier.services.SupplierInfoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class SupplierInfoController {

    final
    SupplierInfoService supplierInfoService;

    public SupplierInfoController(SupplierInfoService supplierInfoService) {
        this.supplierInfoService = supplierInfoService;
    }

    @RequestMapping("/{state}")
    public SupplierInfo InfobyState(@PathVariable String state) {
        System.out.println("Recenendo estado: " + state);
        return supplierInfoService.getInfoByState(state);
    }
}
