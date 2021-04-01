package com.doctor.appointment.controller;

import com.doctor.appointment.dto.DoctorDto;
import com.doctor.appointment.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/add")
    public String addMethod(@RequestParam String value){
        return value;
    }

    @GetMapping("/doctor/{id}")
    public String getDoctor(@PathVariable String id){
        return id ;
    }

    @PostMapping("/catalog")
    public String addToCatalog(@RequestBody DoctorDto DoctorDto){
        System.out.println(DoctorDto.getName());
        System.out.println(DoctorDto.getAge());

        return "Ok";
    }

    @GetMapping("/getAll")
    public List<DoctorDto> getAllDoctors(){
        return doctorService.getAll();
    }

    @PostMapping("/addDoctor")
    public String addDoctor(@RequestBody DoctorDto doctorDto){
        return doctorService.addDoctor(doctorDto);
    }
}