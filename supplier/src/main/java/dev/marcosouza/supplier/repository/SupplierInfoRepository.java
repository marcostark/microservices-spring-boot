package dev.marcosouza.supplier.repository;

import dev.marcosouza.supplier.model.SupplierInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierInfoRepository extends JpaRepository<SupplierInfo, Long> {

    SupplierInfo findByState(String state);
}
