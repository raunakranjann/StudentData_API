package com.StudentData.StudentData_API.Repository;

import com.StudentData.StudentData_API.model.StudentData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentData, Long> {
}
