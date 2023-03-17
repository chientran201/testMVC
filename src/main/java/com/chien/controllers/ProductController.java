package com.chien.controllers;

import com.chien.DAO.ProductDAO;
import com.chien.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    private ProductDAO productDAO;

//    @Autowired
//    private ProductService productService;

    @RequestMapping(value = "/home")
    public String helloworld(Model model){
        List<Product> li = productDAO.getDb();
        model.addAttribute("listproduct",li);
        model.addAttribute("chien","chientran");
        return "Home";
    }

    @RequestMapping (value = "/create")
    public String createProduct(Model model){
        model.addAttribute("chien","chientran");
    return "create";
    }
 /*   @GetMapping("/products")
    public ModelAndView listProducts(@RequestParam("s") Optional<String> s, Pageable pageable) {
        Product product = new Product();
        List<Product> products = new ArrayList<>();
        products.add(product);
        ModelAndView modelAndView = new ModelAndView("/products/list");
        modelAndView.addObject("products", products);
        return modelAndView;
    }*/
}
