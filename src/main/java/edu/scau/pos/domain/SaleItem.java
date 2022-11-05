package edu.scau.pos.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 邓国文
 * @version 1.0
 * 销售明细
 */
public class SaleItem implements Serializable {
    private Long saleItemId;
    private ProductDescription productDescription;
    private int quantity;

    public SaleItem(Long saleItemId, ProductDescription productDescription, int quantity) {
        this.saleItemId = saleItemId;
        this.productDescription = productDescription;
        this.quantity = quantity;
    }

    public SaleItem() {
    }

    /**
     * 计算小计
     * @return 小计
     */
    public BigDecimal getSubTotal() {
        BigDecimal subTotal = productDescription.getPrice().multiply(new BigDecimal(quantity));
        return subTotal;
    }
    public Long getSaleItemId() {
        return saleItemId;
    }

    public void setSaleItemId(Long saleItemId) {
        this.saleItemId = saleItemId;
    }

    public ProductDescription getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(ProductDescription productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "SaleItem{" +
                "saleItemId=" + saleItemId +
                ", productDescription=" + productDescription +
                ", quantity=" + quantity +
                '}';
    }
}
