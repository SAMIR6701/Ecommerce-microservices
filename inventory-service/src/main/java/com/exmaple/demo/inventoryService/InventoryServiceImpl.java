package com.example.demo.inventoryService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.inventoryEntity.InventoryEntity;
import com.example.demo.inventoryRepository.InventoryRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class InventoryServiceImpl  implements InventoryService{
	@Autowired
	private final InventoryRepository inventoryrepo;
	 

	@Override
	public InventoryEntity save(InventoryEntity inventory) {
		
		return inventoryrepo.save(inventory);
	}

	@Override
	public InventoryEntity getInventory(Long productId) {
		return inventoryrepo.findById(productId).orElseThrow(()-> new RuntimeException ("product not found"));
	}

}
