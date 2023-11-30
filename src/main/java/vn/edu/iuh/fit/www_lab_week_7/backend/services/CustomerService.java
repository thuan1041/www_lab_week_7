package vn.edu.iuh.fit.www_lab_week_7.backend.services;

import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_lab_week_7.backend.models.Customer;
import vn.edu.iuh.fit.www_lab_week_7.backend.repositories.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
