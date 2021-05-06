package com.LucasMira.DsVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LucasMira.DsVendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
