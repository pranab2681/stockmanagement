package com.paav.StockManagement.service.intf;

import com.paav.StockManagement.entity.Product;
import org.json.simple.JSONObject;

public interface IProductService {
    JSONObject addProduct(Product product);
}
