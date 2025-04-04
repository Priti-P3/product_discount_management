package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.dto.DiscountRequest;
import com.example.demo.entity.Product;

public interface ProductService {

	BigDecimal applyDiscount(DiscountRequest request);

	Product getProduct(Long productId);

	Product addProduct(Product product);

}
