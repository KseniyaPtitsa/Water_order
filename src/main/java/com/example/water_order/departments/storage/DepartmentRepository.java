package com.example.water_order.departments.storage;

import com.example.water_order.departments.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
