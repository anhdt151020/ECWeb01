package com.example.webtutorials01.Controller;

import com.example.webtutorials01.Domain.Category;
import com.example.webtutorials01.Repository.CategoryRepository;
import com.example.webtutorials01.Service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("categories")
public class CategoryController {

    private final CategoryService categoryService;
    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryService categoryService, CategoryRepository categoryRepository) {
        this.categoryService = categoryService;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("newOrEdit")
    public String newOrEdit(ModelMap model){
        Category category = new Category();
        model.addAttribute("category",category);
        return "categories/newOrEdit";
    }

    @PostMapping("saveOrUpdate")
    public String saveOrUpdate(ModelMap model, Category item){
        categoryRepository.save(item);
        model.addAttribute("message", "New category is saved!");
        return "categories/newOrEdit";
    }

}
