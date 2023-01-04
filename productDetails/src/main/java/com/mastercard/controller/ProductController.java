package com.mastercard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mastercard.model.Product;
import com.mastercard.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productServiceImpl;
	
	@PostMapping("/savedata")
	public ResponseEntity<String> saveData(@RequestBody Product product){
		productServiceImpl.saveData(product);
		return ResponseEntity.ok("Data Saved Successfully");
	}
	@GetMapping("/getalldata")
	public ResponseEntity<List<Product>> getAllData(){
	return	(ResponseEntity<List<Product>>) productServiceImpl.getAllData();
		
	}
	@PutMapping("/updatedata")
	public ResponseEntity<Product> updateData(@RequestBody Product product){
		return	ResponseEntity.ok(productServiceImpl.updateData(product));
			
		}
	@DeleteMapping("/deletedata/{prodId}")
	public ResponseEntity<String> deleteData(@PathVariable int prodId){
			productServiceImpl.deleteData(prodId);
			return ResponseEntity.ok("Data Deleted sucessfully");
			
		}
}
