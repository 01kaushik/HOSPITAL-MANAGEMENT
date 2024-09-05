package com.Hospital_Management.Hospital.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HospitalInventory {
    @Id
    private int productId;
    private String ProductName;
    private int Quantity;
    private int Price;


    public HospitalInventory() {
    }

    public HospitalInventory(int productId, String productName, int quantity, int price) {
        this.productId = productId;
        ProductName = productName;
        Quantity = quantity;
        Price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "HospitalInventory{" +
                "productId=" + productId +
                ", ProductName='" + ProductName + '\'' +
                ", Quantity=" + Quantity +
                ", Price=" + Price +
                '}';
    }
}
