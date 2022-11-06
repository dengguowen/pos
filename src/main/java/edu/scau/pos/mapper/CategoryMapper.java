package edu.scau.pos.mapper;

import edu.scau.pos.domain.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface CategoryMapper {
    /**
     *根据ID得到category对象
     */
    @Select("SELECT category_id,category_name FROM pos_category WHERE category_id = #{categoryId}")
    public Category getCategoryById(Long categoryId);
    /**
     * 查询所有的category
     * @return
     */
    @Select("SELECT category_id,category_name FROM pos_category")
    public List<Category> listAllCategory();
}
