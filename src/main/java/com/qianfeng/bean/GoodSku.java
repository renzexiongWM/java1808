package com.qianfeng.bean;

public class GoodSku {
    private String skuId;

    private String skuName;

    private String skuCost;

    private String skuPrice;

    private String skuPmoney;

    private String goodId;

    private Integer orderNo;

    private String serviceMoney;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId == null ? null : skuId.trim();
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    public String getSkuCost() {
        return skuCost;
    }

    public void setSkuCost(String skuCost) {
        this.skuCost = skuCost == null ? null : skuCost.trim();
    }

    public String getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(String skuPrice) {
        this.skuPrice = skuPrice == null ? null : skuPrice.trim();
    }

    public String getSkuPmoney() {
        return skuPmoney;
    }

    public void setSkuPmoney(String skuPmoney) {
        this.skuPmoney = skuPmoney == null ? null : skuPmoney.trim();
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId == null ? null : goodId.trim();
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getServiceMoney() {
        return serviceMoney;
    }

    public void setServiceMoney(String serviceMoney) {
        this.serviceMoney = serviceMoney == null ? null : serviceMoney.trim();
    }
}