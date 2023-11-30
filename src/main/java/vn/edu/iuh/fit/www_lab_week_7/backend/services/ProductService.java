package vn.edu.iuh.fit.www_lab_week_7.backend.services;

import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_lab_week_7.backend.models.Product;
import vn.edu.iuh.fit.www_lab_week_7.backend.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> findAll(){
        return productRepository.findAll();
    }
}
