package com.Hospital_Management.Hospital.Service;

import com.Hospital_Management.Hospital.Model.HospitalInventory; // Import the correct HospitalInventory class
import com.Hospital_Management.Hospital.Model.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalInventoryService {

    @Autowired
    InventoryRepo inven;


    public void AddProduct(HospitalInventory product){
        inven.save(product);
    }

}