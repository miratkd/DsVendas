package com.LucasMira.DsVendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LucasMira.DsVendas.Dtos.SaleDTO;
import com.LucasMira.DsVendas.Dtos.SaleSuccessDTO;
import com.LucasMira.DsVendas.Dtos.SaleSumDTO;
import com.LucasMira.DsVendas.entities.Sale;
import com.LucasMira.DsVendas.repositories.SaleRepository;
import com.LucasMira.DsVendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> list = repository.findAll(pageable);
		return list.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return repository.successGroupedBySeller();
	}
}
