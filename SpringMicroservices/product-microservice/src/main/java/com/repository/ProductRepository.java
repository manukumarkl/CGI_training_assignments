package com.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.collection.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
