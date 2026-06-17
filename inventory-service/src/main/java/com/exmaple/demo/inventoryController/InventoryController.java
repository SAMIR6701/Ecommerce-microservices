package com.example.demo.inventoryContorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.inventoryEntity.InventoryEntity;
import com.example.demo.inventoryService.InventoryServiceImpl;

import lombok.RequiredArgsConstructor;

@RequestMapping("/inventory")
@RestController
@RequiredArgsConstructor
public class InventoryController {
	
	@Autowired
	private final InventoryServiceImpl inventoryservice;
	
	@PostMapping()
	public InventoryEntity addStock(@RequestBody InventoryEntity inventory) {
		return inventoryservice.save(inventory);
		
	}
	@GetMapping("/{productId}")
	public InventoryEntity getInventorybyId(@PathVariable Long productId) {
		return inventoryservice.getInventory(productId);
	}
	

}
