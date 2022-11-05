package edu.scau.pos.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;

@Component
public class ProductDescription implements Serializable {
    private Long productId;
    private String productSn;
    private Category category;
    private String productName;
    private BigDecimal price;

    public ProductDescription() {
    }

    public ProductDescription(Long productId, String productSn, Category category, String productName, BigDecimal price) {
        this.productId = productId;
        this.productSn = productSn;
        this.category = category;
        this.productName = productName;
        this.price = price;
    }
    //   setter 和 getter

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductDescription{" +
                "productId=" + productId +
                ", productSn='" + productSn + '\'' +
                ", category=" + category +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
