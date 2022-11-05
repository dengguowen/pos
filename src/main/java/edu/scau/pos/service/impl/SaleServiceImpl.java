package edu.scau.pos.service.impl;

import edu.scau.pos.domain.Payment;
import edu.scau.pos.domain.ProductDescription;
import edu.scau.pos.domain.Sale;
import edu.scau.pos.domain.SaleItem;
import edu.scau.pos.service.ISaleService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author 邓国文
 * @version 1.0
 */
@Service
public class SaleServiceImpl implements ISaleService {
    private Sale currentSale;
    /**
     * 开始新的销售
     */
    @Override
    public void makeNewSale() {
        currentSale=new Sale();

    }

    /**
     * 实例化SaleItem
     *
     * @param product  商品对象
     * @param quantity 数量
     */
    @Override
    public void makeLineItem(ProductDescription product, int quantity) {
    // 判断商品是否已录入
        if(!isEntered(product.getProductSn(),quantity)){
            SaleItem saleItem = new SaleItem();
            saleItem.setProductDescription(product);
            saleItem.setQuantity(quantity);
            currentSale.getSaleItems().add(saleItem);
        }
    }
    /**
     * 判断商品是否已录入
     * @param itemSn
     * @param quantity
     * @return
     */
    private boolean isEntered(String itemSn,int quantity){
        boolean flag = false;
        for(SaleItem si : currentSale.getSaleItems()){
            // 如果已经录入则修改数量
            if(itemSn.equals(si.getProductDescription().getProductSn())) {
                flag = true;
                int quantityOriginal = si.getQuantity();
                si.setQuantity(quantityOriginal + quantity);
            }
        }
        return flag;
    }

    /**
     * 结束订单商品录入
     *
     * @return 总金额
     */
    @Override
    public BigDecimal endSale() {
        BigDecimal total = this.getTotal();
        currentSale.setTotal(total);
        return total;
    }
    /**
     * 计算总金额
     * @return
     */
    private BigDecimal getTotal(){
        BigDecimal total = new BigDecimal(0);
        List<SaleItem> saleItemList = currentSale.getSaleItems();
        for(SaleItem si : saleItemList) {
            total = total.add(si.getSubTotal());
        }
        return total;
    }

    /**
     * 订单支付
     *
     * @param cashTendered 付款金额
     * @return 找零
     */
    @Override
    public BigDecimal makePayment(BigDecimal cashTendered) {
        BigDecimal total = currentSale.getTotal();
        Payment payment = new Payment();
        payment.setAmount(total);
        currentSale.setPayment(payment);
        BigDecimal change = cashTendered.subtract(total);
        return change;
    }
}
