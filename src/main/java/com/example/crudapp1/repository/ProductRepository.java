package com.example.crudapp1.repository;
import com.example.crudapp1.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}