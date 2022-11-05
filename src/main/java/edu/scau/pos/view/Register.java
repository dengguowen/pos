package edu.scau.pos.view;

import edu.scau.pos.domain.ProductDescription;
import edu.scau.pos.mapper.ProductCatalog;
import edu.scau.pos.service.ISaleService;
import edu.scau.pos.vo.SaleItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author 邓国文
 * @version 1.0
 */
@Component
public class Register {
    @Autowired
    private ISaleService saleService;

    @Autowired
    private ProductCatalog productCatalog;

    /**
     * 开始一次新的销售
     */
    public void makeNewSale(){
        saleService.makeNewSale();

    }
    /**
     * 输入商品
     * @param itemSn
     * @param quantity
     */
    public SaleItemVo enterItem(String itemSn, int quantity){
        SaleItemVo saleItemVo = null;
        ProductDescription product = productCatalog.getProductBySn(itemSn);
        if(product != null) {
            saleService.makeLineItem(product, quantity);
            saleItemVo = new SaleItemVo(itemSn, product.getProductName(), product.getPrice(), quantity);
        }
        return saleItemVo;
    }
    /**
     * 结束销售
     */
    public BigDecimal endSale(){
        return saleService.endSale();
    }
    /**
     * 确认支付
     * @param cashTendered
     */
    public BigDecimal makePayment(BigDecimal cashTendered){
        return saleService.makePayment(cashTendered);
    }
}

