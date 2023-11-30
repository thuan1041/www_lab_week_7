package vn.edu.iuh.fit.www_lab_week_7.frontend_controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.edu.iuh.fit.www_lab_week_7.backend.services.CustomerService;

@Controller
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("customer/list")
    public String findAll(Model model){
        model.addAttribute("customers", customerService.findAll());
        return "customer/customer";
    }
}
