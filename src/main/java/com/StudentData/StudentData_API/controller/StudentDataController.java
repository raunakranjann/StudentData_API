package com.StudentData.StudentData_API.controller;

import com.StudentData.StudentData_API.Repository.StudentRepository;
import com.StudentData.StudentData_API.model.StudentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentDataController {

    @Autowired
    private StudentRepository repository;

    @PostMapping
    public StudentData createStudentData(@RequestBody StudentData studentData) {
        return repository.save(studentData);
    }

    @GetMapping
    public List<StudentData> getAllStudentData(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public StudentData getStudentData(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public StudentData updateStudentData(@PathVariable Long id, @RequestBody StudentData updated) {
        return repository.findById(id).map(studentData -> {
            studentData.setRoll(updated.getRoll());
            studentData.setName(updated.getName());
            studentData.setPhno(updated.getPhno());
            studentData.setEmail(updated.getEmail());
            studentData.setCourse(updated.getCourse());
            return repository.save(studentData);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentData(@PathVariable Long id) {
        repository.deleteById(id);
    }


}
