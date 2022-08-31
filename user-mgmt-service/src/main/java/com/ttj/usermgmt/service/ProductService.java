package com.ttj.usermgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttj.usermgmt.domain.Product;
import com.ttj.usermgmt.domain.ProductDto;
import com.ttj.usermgmt.repo.ProductDao;


@Service
public class ProductService {
	@Autowired
	private ProductDao productDao;

	public Product save(ProductDto product) {

		Product newProduct = new Product();
		newProduct.setName(product.getName());
		newProduct.setPrice(product.getPrice());

		return productDao.save(newProduct);
	}

	public Product update(ProductDto product) {

		Product upProduct = new Product();
		upProduct.setId(product.getId());
		upProduct.setName(product.getName());
		upProduct.setPrice(product.getPrice());

		return productDao.save(upProduct);
	}

	public void delete(Integer id) {

		productDao.deleteById(id);

	}
	
	public Product getById(Integer id) {

		return productDao.findById(id).get();

	}
	
	public Iterable<Product> getProduct() {

		return productDao.findAll();

	}

}
