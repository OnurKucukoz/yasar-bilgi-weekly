package com.yasarbilgi.yasarbilgiweeklyschedule.repositories;

import com.yasarbilgi.yasarbilgiweeklyschedule.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
