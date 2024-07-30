package com.deneme2.deneme2.service;

import com.deneme2.deneme2.exception.ResourceNotFoundException;
import com.deneme2.deneme2.model.Category;
import com.deneme2.deneme2.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category not found"));
    }

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
}
