package com.demo.service;

import com.demo.model.*;
import com.demo.repository.*;
import java.util.*;

import org.springframework.stereotype.Service;


@Service
public class InventoryService {
	private final InventoryRepository repo;
	
	public InventoryService(InventoryRepository repo) {
		this.repo = repo;
	}
	
	public List<InventoryModel> getAllProducts(){
		return repo.findAll();
	}
	
	public Optional<InventoryModel> getProductById(long id) {
        return repo.findById(id);
    }

    public InventoryModel addProduct(InventoryModel p) {
        return repo.save(p);
    }
    
    public InventoryModel updateProduct(long id, InventoryModel updatedProduct) {
        return repo.findById(id).map(p -> {
            p.setName(updatedProduct.getName());
            p.setCategory(updatedProduct.getCategory());
            p.setQuantity(updatedProduct.getQuantity());
            p.setPrice(updatedProduct.getPrice());
            return repo.save(p);
        }).orElse(null);
    }

    public void deleteProduct(long id) {
        repo.deleteById(id);
    }
}
