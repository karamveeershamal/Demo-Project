package com.example.Second_demoMysql.repository;

import com.example.Second_demoMysql.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DepartmentRepository extends JpaRepository<Department, Long> {
//    List<Department> findByName(String name);
}
