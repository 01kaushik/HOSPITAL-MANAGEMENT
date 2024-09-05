package com.Hospital_Management.Hospital.Service;

import com.Hospital_Management.Hospital.Model.PatientDetails;
import com.Hospital_Management.Hospital.Model.Repocitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientDetailService {

    private final Repocitory repo;

    @Autowired
    public PatientDetailService(Repocitory repo) {
        this.repo = repo;
    }

    public void register(PatientDetails details){
        repo.save(details);
        System.out.println("successfully loaded");
    }

    public List<PatientDetails> getdetails(){
        return repo.findAll();
    }
}