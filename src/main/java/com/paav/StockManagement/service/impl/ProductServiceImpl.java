package com.paav.StockManagement.service.impl;

import com.paav.StockManagement.entity.Product;
import com.paav.StockManagement.repository.ProductRepository;
import com.paav.StockManagement.service.intf.IProductService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public JSONObject addProduct(Product product) {
        JSONObject response = null;
        try {
            response = new JSONObject();
            Product savedProduct = productRepository.save(product);
            response.put("data",savedProduct);
            response.put("status","OK");
            response.put("statusCode","200");
            return response;
        }catch (Exception e){
            e.printStackTrace();
            return response;
        }
    }
}
