package com.lins.dsmeta.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lins.dsmeta.entities.Sale;
import com.lins.dsmeta.services.SaleService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	

	private SaleService saleService;
	
	@GetMapping
	public Page<Sale> listSales(
			@RequestParam(value = "minDate", defaultValue = "") String minDate,
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate,
			Pageable pageable){
		
		return saleService.findSales(minDate, maxDate, pageable);
	}
	
	
	
	
	
	

}
