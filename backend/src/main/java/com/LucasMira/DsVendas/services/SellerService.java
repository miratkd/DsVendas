package com.LucasMira.DsVendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LucasMira.DsVendas.Dtos.SellerDTO;
import com.LucasMira.DsVendas.entities.Seller;
import com.LucasMira.DsVendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<Seller> list = repository.findAll();
		return list.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
