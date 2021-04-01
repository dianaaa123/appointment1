package com.doctor.appointment.repository;

import com.doctor.appointment.dto.DoctorDto;
import com.doctor.appointment.model.Doctor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DoctorRepository {
    private static List<Doctor> doctorList = new ArrayList<>();

    public List<Doctor> findAll(){
        return doctorList;
    }

    public String addDoctorToList(DoctorDto doctorDto){
        Doctor doctor = new Doctor(doctorDto);
        doctorList.add(doctor);

        return "Ok";
    }
}