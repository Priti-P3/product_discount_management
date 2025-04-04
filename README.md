# product_discount_management
A Spring Boot application for managing product discounts, with data persistence using PostgreSQL.


- API test examples - Using Postman
POST - /product/discount:
Method: POST
URL: http://localhost:8080/product/discount
Body (raw JSON): {
  "productId": "8",
  "discountType": "percentage", 
  "discountValue": 10, 
  "seasonalDiscountActive": true,
  "productPrice": 30000, 
  "quantity": 0
}
