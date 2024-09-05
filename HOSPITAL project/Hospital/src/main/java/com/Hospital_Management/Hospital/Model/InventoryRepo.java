package com.Hospital_Management.Hospital.Model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepo extends JpaRepository<HospitalInventory,Integer> {
}
