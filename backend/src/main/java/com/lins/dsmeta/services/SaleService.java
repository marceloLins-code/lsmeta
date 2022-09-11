package com.lins.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.lins.dsmeta.entities.Sale;
import com.lins.dsmeta.repositories.SaleRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SaleService {
	
	
	private SaleRepository saleRepository;
	
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
		
		LocalDate toDay = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		LocalDate min = minDate.equals("") ? toDay.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? toDay : LocalDate.parse(maxDate);

		return saleRepository.findSales(min, max, pageable);
	}
	
	
	
	

}
