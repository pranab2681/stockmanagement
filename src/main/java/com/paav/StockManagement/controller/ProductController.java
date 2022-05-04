package com.paav.StockManagement.controller;

import com.paav.StockManagement.entity.Product;
import com.paav.StockManagement.service.intf.IProductService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ProductController {

    @Autowired
    private IProductService productService;

    @PostMapping("/add")
    public JSONObject addProduct(@RequestBody Product product){
        JSONObject response = productService.addProduct(product);
        return response;
    }
}
