package com.lins.dsmeta.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lins.dsmeta.entities.Sale;
import com.lins.dsmeta.repositories.SaleRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SaleService {
	
	
	private SaleRepository saleRepository;
	
	public List<Sale> findSales() {
		return saleRepository.findAll();
	}
	
	
	
	

}
