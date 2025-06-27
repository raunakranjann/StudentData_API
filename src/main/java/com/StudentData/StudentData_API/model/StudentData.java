package com.StudentData.StudentData_API.model;

import jakarta.persistence.*;

@Entity
@Table(name = "BasicStudentData")
public class StudentData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roll;

    @Column(nullable = false)
    private String name;

    private String email;

    private long phno;

    @Column(nullable = false)
    private String course;



    //getter and setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhno() {
        return phno;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    //default constructor


    public StudentData() {
    }

    public StudentData(Long id, String roll, String name, String email, long phno, String course) {
        this.id = id;
        this.roll = roll;
        this.name = name;
        this.email = email;
        this.phno = phno;
        this.course = course;
    }
}
