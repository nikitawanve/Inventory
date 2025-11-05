package com.demo.repository;


import com.demo.model.InventoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<InventoryModel, Long>{
	
}
