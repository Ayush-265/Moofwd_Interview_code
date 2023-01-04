package com.mastercard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mastercard.dao.ProductDao;
import com.mastercard.model.Product;

@Service
public class ProductService {

	@Autowired
	ProductDao productDaoImpl;
	public void saveData(Product product) {
		// TODO Auto-generated method stub
		productDaoImpl.saveData(product);
	}

	public List<Product> getAllData() {
		// TODO Auto-generated method stub
		return productDaoImpl.getAllData();
	}

	public Product updateData(Product product) {
		// TODO Auto-generated method stub
		return productDaoImpl.updateData(product);
	}

	public void deleteData(int prodId) {
		// TODO Auto-generated method stub
		productDaoImpl.deleteData(prodId);
	}

}
