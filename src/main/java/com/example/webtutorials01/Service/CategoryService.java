package com.example.webtutorials01.Service;

import com.example.webtutorials01.Domain.Category;
import com.example.webtutorials01.Repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void save(Category item) {
        categoryRepository.save(item);
    }
}
