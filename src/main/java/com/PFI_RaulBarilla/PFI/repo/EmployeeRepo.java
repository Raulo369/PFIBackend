package com.PFI_RaulBarilla.PFI.repo;

import com.PFI_RaulBarilla.PFI.model.Employee;
import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

   Optional Employee findEmployeeById(Long id)
}
