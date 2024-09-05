package com.Hospital_Management.Hospital.controller;

import com.Hospital_Management.Hospital.Model.PatientDetails;
import com.Hospital_Management.Hospital.Service.PatientDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Register")
public class PatientDetailController {
    private final PatientDetailService service;

    @Autowired
    public PatientDetailController(PatientDetailService service) {
        this.service = service;
    }

    @PostMapping("/RegisterPatient")
    public void registerPatient(@RequestBody PatientDetails details){
        service.register(details);
    }

    @GetMapping("/Getdetails")
    public List<PatientDetails> getdetails(){
        return service.getdetails();
    }
}



// input formate
//{
//        "reason": "Some reason",
//        "parentName": "Parent name",
//        "studentRollNum": "Roll number",
//        "studentName": "Student name",
//        "studentRoomNum": 123,
//        "studentHostel": "Hostel name",
//        "parentNum": 1234567890,
//        "studentPhNum": 1234567890
//        }