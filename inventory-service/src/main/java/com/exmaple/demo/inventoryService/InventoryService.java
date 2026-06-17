package com.example.demo.inventoryService;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.inventoryEntity.InventoryEntity;

@Service
public interface InventoryService {
	InventoryEntity save(InventoryEntity inventory);
	InventoryEntity getInventory(Long productId);

}
