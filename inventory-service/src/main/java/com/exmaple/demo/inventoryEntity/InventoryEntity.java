package com.example.demo.inventoryEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class InventoryEntity {
	@Id

	private Long id;
	private Integer quantity;

}
