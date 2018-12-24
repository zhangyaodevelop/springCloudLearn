package com.order.service.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderEntryInfo {
    private String orderEntryUuid;

    private String orderUuid;

    private BigDecimal buyPrice;

    private BigDecimal buyQuantity;

    private String productCode;

    private String unit;

    private BigDecimal basePrice;

    private Date createDate;

    public String getOrderEntryUuid() {
        return orderEntryUuid;
    }

    public void setOrderEntryUuid(String orderEntryUuid) {
        this.orderEntryUuid = orderEntryUuid == null ? null : orderEntryUuid.trim();
    }

    public String getOrderUuid() {
        return orderUuid;
    }

    public void setOrderUuid(String orderUuid) {
        this.orderUuid = orderUuid == null ? null : orderUuid.trim();
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    public BigDecimal getBuyQuantity() {
        return buyQuantity;
    }

    public void setBuyQuantity(BigDecimal buyQuantity) {
        this.buyQuantity = buyQuantity;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}