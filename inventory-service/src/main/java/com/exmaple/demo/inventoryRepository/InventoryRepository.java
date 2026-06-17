package com.example.demo.inventoryRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.inventoryEntity.InventoryEntity;
@Repository
public interface InventoryRepository extends JpaRepository<InventoryEntity,Long> {

}
