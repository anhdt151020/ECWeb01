package com.example.webtutorials01.Service;

import com.example.webtutorials01.Domain.Category;
import com.example.webtutorials01.Repository.CategoryRepository;
import com.example.webtutorials01.Service.Error.CategoryErrorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final Logger log = LoggerFactory.getLogger(CategoryService.class);
    private static final String ENTITY_NAME = "CategoryService";

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void save(Category item) {
            categoryRepository.save(item);
    }

    public List<Category> getListCategory(){
        List<Category> categoryList = categoryRepository.findAll();
        if (categoryList.isEmpty()){
            return null;
        } else return categoryList;
    }

}
