package edu.scau.pos.service;

import edu.scau.pos.domain.Category;

import java.util.List;

public interface ICategoryService {
    /**
     *根据ID得到category对象
     */
    public Category getCategoryById(Long categoryId);
    /**
     * 查询所有的category
     * @return
     */
    public List<Category> listAllCategory();
}
