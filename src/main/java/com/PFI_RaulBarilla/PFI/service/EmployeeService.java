package com.PFI_RaulBarilla.PFI.service;

import com.PFI_RaulBarilla.PFI.repo.EmployeeRepo;

public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo  employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
}
