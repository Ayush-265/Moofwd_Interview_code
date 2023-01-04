package com.mastercard.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.mastercard.model.Product;
import com.mastercard.repo.ProductRepo;

@Component
public class ProductDao {

	@Autowired
	ProductRepo productRepoImpl;
	public void saveData(Product product) {
		// TODO Auto-generated method stub
		productRepoImpl.save(product);
	}

	public List<Product> getAllData() {
		// TODO Auto-generated method stub
		return  productRepoImpl.findAll();
	}

	public Product updateData(Product product) {
		// TODO Auto-generated method stub
		return productRepoImpl.save(product);
	}

	public void deleteData(int prodId) {
		// TODO Auto-generated method stub
		productRepoImpl.deleteById(prodId);
	}

}
