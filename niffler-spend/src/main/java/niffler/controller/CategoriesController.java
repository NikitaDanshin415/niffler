package niffler.controller;

import niffler.model.CategoryJson;
import niffler.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriesController {

    private final CategoryService categoryService;

    @Autowired
    public CategoriesController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public List<CategoryJson> getCategories(@RequestParam String username) {
        String test = "qwe";
        return categoryService.getAllCategories(username);
    }

    @PostMapping("/category")
    public CategoryJson addCategory(@RequestBody CategoryJson category) {
        String test = "qwe";
        return categoryService.addCategory(category);
    }
}
