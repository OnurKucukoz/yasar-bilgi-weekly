package com.yasarbilgi.yasarbilgiweeklyschedule.services;

import com.yasarbilgi.yasarbilgiweeklyschedule.entities.Department;
import com.yasarbilgi.yasarbilgiweeklyschedule.repositories.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentService {
    DepartmentRepository departmentRepository;
    public Department getDepartment(long id){
        return departmentRepository.findById(id).orElseThrow();
    }
    public List<Department> getAll(){
        return departmentRepository.findAll();
    }
}
