package com.lins.dsmeta.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lins.dsmeta.entities.Sale;
import com.lins.dsmeta.services.SaleService;
import com.lins.dsmeta.services.SmsService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	

	private SaleService saleService;
	
	private SmsService smsService;
	
	@GetMapping
	public Page<Sale> listSales(
			@RequestParam(value = "minDate", defaultValue = "") String minDate,
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate,
			Pageable pageable){
		
		return saleService.findSales(minDate, maxDate, pageable);
	}
	
	@GetMapping("/{id}/notification")
	public void notifySms(@PathVariable Long id){
		smsService.sendSms(id);
	}
	
	
	
	
	

}
