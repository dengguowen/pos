package edu.scau.pos.test.service;

import edu.scau.pos.domain.Category;
import edu.scau.pos.service.ICategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 邓国文
 * @version 1.0
 */
@SpringBootTest
class CategoryServiceImplTest {
    @Autowired
    private ICategoryService categoryService;

    @Test
    void getCategoryById() {
        Category category = categoryService.getCategoryById(2l);
        System.out.println(category);
    }

    @Test
    void listAllCategory() {
       List<Category> categoryList = categoryService.listAllCategory();
        System.out.println(categoryList);
    }
}