package com.sportshoes.website.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportshoes.website.Entity.Product;
import com.sportshoes.website.Repositary.ProductRepository;

@Service
public class ProductService {
@Autowired
ProductRepository productRepository;
	public List<Product> getListofProduct(){ return productRepository.findAll();}
	public void addProduct(Product product) {productRepository.save(product);}
	public void removeProductById(long id) { productRepository.deleteById(id);}
	public Optional<Product> getProductById(Long id){return productRepository.findById(id);}
	public List<Product> getAllProductByCategoryByID(int id){return productRepository.findAllByCategory_Id(id);}
}
