package com.github.wxiaoqi.security.acesale.entity;

import javax.persistence.*;

@Table(name = "saleorder_detail")
public class SaleOrderDetail {
    @Id
    @Column(name = "_id")
    private String id;

    @Column(name = "_pid")
    private String pid;

    @Column(name = "pro_id")
    private String proId;

    private Double num;

    private Double price;

    /**
     * @return _id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return _pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return pro_id
     */
    public String getProId() {
        return proId;
    }

    /**
     * @param proId
     */
    public void setProId(String proId) {
        this.proId = proId;
    }

    /**
     * @return num
     */
    public Double getNum() {
        return num;
    }

    /**
     * @param num
     */
    public void setNum(Double num) {
        this.num = num;
    }

    /**
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }
}