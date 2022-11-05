package edu.scau.pos.service.impl;

import edu.scau.pos.domain.Category;
import edu.scau.pos.mapper.ProductCatalog;
import edu.scau.pos.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
//@Component
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ProductCatalog productCatalog;
    @Override
    public Category getCategoryById(Long categoryId) {
        return productCatalog.getCategoryById(categoryId);
    }

    @Override
    public List<Category> listAllCategory() {
        return productCatalog.listAllCategory();
    }
}
