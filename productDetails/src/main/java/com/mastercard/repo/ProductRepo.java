package com.mastercard.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mastercard.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
