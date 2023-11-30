package vn.edu.iuh.fit.www_lab_week_7.frontend_controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.edu.iuh.fit.www_lab_week_7.backend.models.Employee;
import vn.edu.iuh.fit.www_lab_week_7.backend.services.EmployeeService;

import java.util.List;

@Controller
public class EmployeeController {
    private static EmployeeService employeeService = null;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("employee/list")
    public static String findAll(Model model){
        List<Employee> employees = employeeService.findAll();
        model.addAttribute("employees",employees);
        return "employee/employee";
    }
}
