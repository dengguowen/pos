package edu.scau.pos.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 邓国文
 * @version 1.0
 * 支付实体类
 */
public class Payment implements Serializable {
    private Long paymentId;
    private BigDecimal amount;
    private Date payTime;

    public Payment(Long paymentId, BigDecimal amount, Date payTime) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.payTime = payTime;
    }

    public Payment() {
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }
}
