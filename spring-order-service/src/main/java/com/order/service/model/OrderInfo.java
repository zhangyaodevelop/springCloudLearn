package com.order.service.model;

import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderInfo {
    private String orderUuid;

    private String code;

    private String orderChannels;

    private String userUuid;

    private BigDecimal totalPrice;

    private BigDecimal deliveryCost;

    private Date createDate;

    private String status;

    @Transient
    private List<OrderEntryInfo>  orderEntryInfos;


    public List<OrderEntryInfo> getOrderEntryInfos() {
        return orderEntryInfos;
    }

    public void setOrderEntryInfos(List<OrderEntryInfo> orderEntryInfos) {
        this.orderEntryInfos = orderEntryInfos;
    }

    public String getOrderUuid() {
        return orderUuid;
    }

    public void setOrderUuid(String orderUuid) {
        this.orderUuid = orderUuid == null ? null : orderUuid.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getOrderChannels() {
        return orderChannels;
    }

    public void setOrderChannels(String orderChannels) {
        this.orderChannels = orderChannels == null ? null : orderChannels.trim();
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(BigDecimal deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}