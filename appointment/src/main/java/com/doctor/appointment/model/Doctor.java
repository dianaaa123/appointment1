package com.doctor.appointment.model;

import com.doctor.appointment.dto.DoctorDto;

public class Doctor {
    private String name;
    private String age;

    public Doctor() {
    }

    public Doctor(DoctorDto doctorDto){
        this.name = doctorDto.getName();
        this.age = doctorDto.getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}