package com.PFI_RaulBarilla.PFI.repo;

import com.PFI_RaulBarilla.PFI.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

   Optional employee findEmployeeById(Long id);
}
