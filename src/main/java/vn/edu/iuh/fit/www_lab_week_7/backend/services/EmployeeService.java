package vn.edu.iuh.fit.www_lab_week_7.backend.services;

import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_lab_week_7.backend.models.Employee;
import vn.edu.iuh.fit.www_lab_week_7.backend.repositories.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
}
