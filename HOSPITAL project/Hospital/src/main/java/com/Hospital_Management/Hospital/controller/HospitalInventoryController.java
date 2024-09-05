package com.Hospital_Management.Hospital.controller;

import com.Hospital_Management.Hospital.Model.HospitalInventory; // Import the correct HospitalInventory class
import com.Hospital_Management.Hospital.Service.HospitalInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Inventroy")
public class HospitalInventoryController { // Renamed the class to avoid naming conflict

    @Autowired
    HospitalInventoryService ser;


    @PostMapping("/AddProduct")
    public void AddProduct(com.Hospital_Management.Hospital.Model.HospitalInventory product){ // Use the correct HospitalInventory class
        ser.AddProduct(product);
    }




}