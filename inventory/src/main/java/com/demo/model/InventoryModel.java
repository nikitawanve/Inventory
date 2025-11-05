package com.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class InventoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private double price;


    public InventoryModel() {
    }
    public InventoryModel(long id, String name, String category, int quantity, double price){
        this.name = name;
        this.id = id;
        this.category = category;
        this.price = price;
        this.quantity = quantity;

    }

    public Long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }


}

