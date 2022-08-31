package com.ttj.usermgmt.repo;

import org.springframework.data.repository.CrudRepository;

import com.ttj.usermgmt.domain.Product;


public interface ProductDao extends CrudRepository<Product, Integer>{

}
