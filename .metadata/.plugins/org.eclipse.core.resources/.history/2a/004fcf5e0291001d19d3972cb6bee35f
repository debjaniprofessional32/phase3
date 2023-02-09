package com.sportshoes.website.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportshoes.website.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
List<Product> findAllByCategory_Id(int id);
}
