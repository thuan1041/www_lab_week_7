package vn.edu.iuh.fit.www_lab_week_7.frontend_controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.edu.iuh.fit.www_lab_week_7.backend.models.Product;
import vn.edu.iuh.fit.www_lab_week_7.backend.services.ProductService;

import java.util.List;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("product/list")
    public String findAll(Model model){
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "product/product";
    }
}
