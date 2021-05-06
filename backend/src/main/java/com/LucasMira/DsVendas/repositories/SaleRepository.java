package com.LucasMira.DsVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LucasMira.DsVendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
