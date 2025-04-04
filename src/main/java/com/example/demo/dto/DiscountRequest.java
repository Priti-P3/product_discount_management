package com.example.demo.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class DiscountRequest {
    private Long productId;
    private String discountType; // "flat" or "percentage"
    private BigDecimal discountValue;
    private boolean seasonalDiscountActive;
}
