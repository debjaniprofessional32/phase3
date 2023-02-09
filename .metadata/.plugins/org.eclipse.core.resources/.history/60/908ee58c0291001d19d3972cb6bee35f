package com.sportshoes.website.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportshoes.website.Entity.Category;
import com.sportshoes.website.Repositary.CategoryRepositary;

@Service
public class CategoryService {
@Autowired
CategoryRepositary categoryRepository;
public List<Category> getAllCategory()
{
	return categoryRepository.findAll();
}

public void addCategory(Category category) {
	 categoryRepository.save(category);
	
}
public void removeCategoryByID(int id)
{
	categoryRepository.deleteById(id);
}
public Optional<Category> getCategoryByID(int id)
{
	return categoryRepository.findById(id);
}
}
