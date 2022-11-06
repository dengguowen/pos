package edu.scau.pos.service.impl;

import edu.scau.pos.domain.Category;
import edu.scau.pos.mapper.CategoryMapper;

import edu.scau.pos.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
//@Component
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public Category getCategoryById(Long categoryId) {
        return categoryMapper.getCategoryById(categoryId);
    }

    @Override
    public List<Category> listAllCategory() {
        return categoryMapper.listAllCategory();
    }
}
