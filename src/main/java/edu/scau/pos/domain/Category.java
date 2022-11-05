package edu.scau.pos.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Locale;

/**
 * 产品类别
 * 写成标准POJO类
 */
@Component
public class Category implements Serializable {
    private Long categoryId;
    private String categoryName;

    public Category(){

    }
    //全参构造方法，初始化测试数据

    public Category(Long categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    //   setter 和 getter

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    //测试控制台
    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
