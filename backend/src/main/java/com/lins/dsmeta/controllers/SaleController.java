package com.lins.dsmeta.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public List<Sale> listSales(){
		return saleService.findSales();
	}
	
	
	
	

}
