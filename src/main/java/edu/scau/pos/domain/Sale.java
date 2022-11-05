package edu.scau.pos.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author 邓国文
 * @version 1.0
 * 销售实体类
 */
public class Sale implements Serializable {
    private Long saleId;
    private String saleNo;
    private BigDecimal total;
    private Date saleTime;
    private String status;
    private List<SaleItem> saleItems = new ArrayList<>();
    private Payment payment;

    public Sale() {
    }

    public Sale(Long saleId, String saleNo, BigDecimal total, Date saleTime, String status, List<SaleItem> saleItems, Payment payment) {
        this.saleId = saleId;
        this.saleNo = saleNo;
        this.total = total;
        this.saleTime = saleTime;
        this.status = status;
        this.saleItems = saleItems;
        this.payment = payment;
    }

    public Long getSaleId() {
        return saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    public String getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(String saleNo) {
        this.saleNo = saleNo;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Date getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<SaleItem> getSaleItems() {
        return saleItems;
    }

    public void setSaleItems(List<SaleItem> saleItems) {
        this.saleItems = saleItems;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleId=" + saleId +
                ", saleNo='" + saleNo + '\'' +
                ", total=" + total +
                ", saleTime=" + saleTime +
                ", status='" + status + '\'' +
                ", saleItems=" + saleItems +
                ", payment=" + payment +
                '}';
    }
}
