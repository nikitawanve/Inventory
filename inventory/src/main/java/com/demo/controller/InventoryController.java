package com.demo.controller;

import com.demo.model.*;
import com.demo.service.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*")
public class InventoryController {
	private final InventoryService service;
	
	public InventoryController(InventoryService service)
	{
		this.service = service;
	}
	
    @GetMapping
    public List<InventoryModel> getAll() {
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<InventoryModel> getById(@PathVariable long id) {
        return service.getProductById(id);
    }

    @PostMapping
    public InventoryModel addProduct(@RequestBody InventoryModel p) {
        return service.addProduct(p);
    }

    @PutMapping("/{id}")
    public InventoryModel updateProduct(@PathVariable long id, @RequestBody InventoryModel p) {
        return service.updateProduct(id, p);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable long id) {
        service.deleteProduct(id);
    }
	
}
