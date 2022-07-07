package com.example.webtutorials01.Controller;

import com.example.webtutorials01.Domain.Category;
import com.example.webtutorials01.Repository.CategoryRepository;
import com.example.webtutorials01.Service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("categories")
public class CategoryController {

    private final CategoryService categoryService;


    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("newOrEdit")
    public String newOrEdit(ModelMap model){
        Category category = new Category();
        model.addAttribute("category",category);
        return "categories/newOrEdit";
    }

    @PostMapping("saveOrUpdate")
    public String saveOrUpdate(ModelMap model, Category item){
        categoryService.save(item);
        model.addAttribute("message", "New category is saved!");
        return "redirect:/categories";
    }

    @GetMapping
    public String list(ModelMap model,@RequestParam Optional<String> messages){
        if (messages.isPresent()){
            model.addAttribute("messages",messages.get());
        }

        model.addAttribute("categories", categoryService.getListCategory());
        return "categories/list";
    }

}
