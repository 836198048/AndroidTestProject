package com.fzwsc.mytestproject.bean;

/**
 * Created by Administrator on 2017/11/20 0020.
 */

public class Delivery_CategoryBean implements Cloneable{


    /**
     * id : 59
     * name : 测试水果1
     */

    private String id;
    private String name;
    private String url;
    private String crtime;
    private String ws_id;
    private String pid;
    private String mdtime;
    private String sort;
    private String status;

    //数量
    private int total_count=0;

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCrtime() {
        return crtime;
    }

    public void setCrtime(String crtime) {
        this.crtime = crtime;
    }

    public String getWs_id() {
        return ws_id;
    }

    public void setWs_id(String ws_id) {
        this.ws_id = ws_id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getMdtime() {
        return mdtime;
    }

    public void setMdtime(String mdtime) {
        this.mdtime = mdtime;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public Delivery_CategoryBean clone() throws CloneNotSupportedException {
        return (Delivery_CategoryBean)super.clone();
    }
}
