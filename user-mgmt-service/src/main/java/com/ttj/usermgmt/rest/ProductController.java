package com.ttj.usermgmt.rest;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ttj.usermgmt.domain.ProductDto;
import com.ttj.usermgmt.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/getProductById/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getProductById(@PathVariable(value = "id") Integer id)
			throws SQLException, ClassNotFoundException {
		
		return new ResponseEntity<>(productService.getById(id), HttpStatus.CREATED);
	} 
	
	@RequestMapping(value = "/getProduct", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getProduct()
			throws SQLException, ClassNotFoundException {
		productService.getProduct();
		return new ResponseEntity<>(productService, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/product", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> createProduct(@RequestBody ProductDto product)
			throws SQLException, ClassNotFoundException {
		productService.save(product);
		return new ResponseEntity<>(product, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/updateProduct", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> upStudent(@RequestBody ProductDto product) throws SQLException, ClassNotFoundException {
		productService.update(product);
		return new ResponseEntity<>("Data Updated", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/deleteProduct/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> delStudent(@PathVariable(value = "id") Integer id)
			throws SQLException, ClassNotFoundException {
		productService.delete(id);
		return new ResponseEntity<>("Data Deleted", HttpStatus.CREATED);
	}
}
