package com.example.Second_demoMysql.resource;

import com.example.Second_demoMysql.model.Department;
import com.example.Second_demoMysql.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/rest/department")
public class DepartmentResource {

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping(value = "/all")
    public List<Department> getAll(){
        return departmentRepository.findAll();
    }

//    @GetMapping(value = "/{name}")
//    public List<Department> getByName(@PathVariable("name") String name){
//        return departmentRepository.findByName(name);
//    }

    @PostMapping(value = "/load")
    public List<Department> persist(@RequestBody Department department){
        departmentRepository.save(department);
        return departmentRepository.findAll();
    }

    @PostMapping(value = "/change")
    public Department updateDesc(@RequestParam("Department_ID") Long id, @RequestParam("Description_text") String desc){
        Optional<Department> d = departmentRepository.findById(id);
        Department department = d.get();
        department.setDescription_text(desc);
        departmentRepository.save(department);
        return department;
    }

    @PostMapping(value = "/delete")
    public List<Department> delete(@RequestParam("Department_ID") Long id){
        Optional<Department> d = departmentRepository.findById(id);
        Department department = d.get();
        department.setIs_Active(false);
        return departmentRepository.findAll();
    }


}
