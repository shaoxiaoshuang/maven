package org.sxs.pojo;

/**
 * @ClassName: Supplier
 * @Description:  实体类
 * @Author: SXS
 * @date: 2020/12/9 12:03
 * @Version: V1.0
 */

/**
 * 供应商管理
 */
public class Supplier {

    private String supplierId;
    private String supplierName;
    private String linkMan;
    private String linkTel;
    private String linkAddress;
    private String fax;
    private String describe;

    public Supplier() {
    }

    public Supplier(String supplierId, String supplierName, String linkMan, String linkTel, String linkAddress, String fax, String describe) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.linkMan = linkMan;
        this.linkTel = linkTel;
        this.linkAddress = linkAddress;
        this.fax = fax;
        this.describe = describe;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getLinkTel() {
        return linkTel;
    }

    public void setLinkTel(String linkTel) {
        this.linkTel = linkTel;
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }


    @Override
    public String toString() {
        return
                "supplierId='" + supplierId + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", linkMan='" + linkMan + '\'' +
                ", linkTel='" + linkTel + '\'' +
                ", linkAddress='" + linkAddress + '\'' +
                ", fax='" + fax + '\'' +
                ", describe='" + describe ;

    }
}
