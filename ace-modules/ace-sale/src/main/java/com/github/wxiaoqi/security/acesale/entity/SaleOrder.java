package com.github.wxiaoqi.security.acesale.entity;

import java.util.Date;
import javax.persistence.*;

public class SaleOrder {
    @Id
    @Column(name = "_id")
    private String id;

    @Column(name = "_no")
    private String no;

    @Column(name = "creat_time")
    private Date creatTime;

    private String creater;

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
     * @return _no
     */
    public String getNo() {
        return no;
    }

    /**
     * @param no
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * @return creat_time
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * @param creatTime
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * @return creater
     */
    public String getCreater() {
        return creater;
    }

    /**
     * @param creater
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }
}