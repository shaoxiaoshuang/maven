package org.sxs.pojo;

/**
 * @ClassName: Goods
 * @Description: 商品管理
 * @Author: SXS
 * @date: 2020/12/9 12:28
 * @Version: V1.0
 */
public class Goods {
    private String goodId;
    private String goodsName;
    private String goodsPrice;
    private String unit;
    private String supplierId;
    private int stock;

    public Goods() {
    }

    public Goods(String goodId, String goodsName, String goodsPrice, String unit, String supplierId, int stock) {
        this.goodId = goodId;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.unit = unit;
        this.supplierId = supplierId;
        this.stock = stock;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return goodId + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice='" + goodsPrice + '\'' +
                ", unit='" + unit + '\'' +
                ", supplierId='" + supplierId + '\'' +
                ", stock=" + stock ;

    }
}

