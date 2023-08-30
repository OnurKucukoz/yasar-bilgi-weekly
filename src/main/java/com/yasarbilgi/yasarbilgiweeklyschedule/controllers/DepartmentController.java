package com.yasarbilgi.yasarbilgiweeklyschedule.controllers;

import com.yasarbilgi.yasarbilgiweeklyschedule.entities.Department;
import com.yasarbilgi.yasarbilgiweeklyschedule.services.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/department")
@AllArgsConstructor
public class DepartmentController {
    DepartmentService departmentService;
    @GetMapping
    public Department getOneDepartment(@RequestParam("id") long id){
        return departmentService.getDepartment(id);
    }
    @GetMapping(path = "/all")
    public List<Department> getAllDepartments(){
        return departmentService.getAll();
    }

}
