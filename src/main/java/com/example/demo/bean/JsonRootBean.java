package com.example.demo.bean;

import java.util.List;

/**
 * Auto-generated: 2021-12-05 9:52:13
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class JsonRootBean {

    private String status;
    private String msg;
    private String path;
    private List<ImageFiles> imageFiles;
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public String getPath() {
        return path;
    }

    public void setImageFiles(List<ImageFiles> imageFiles) {
        this.imageFiles = imageFiles;
    }
    public List<ImageFiles> getImageFiles() {
        return imageFiles;
    }

    @Override
    public String toString() {
        return "JsonRootBean{" +
                "status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                ", path='" + path + '\'' +
                ", imageFiles=" + imageFiles +
                '}';
    }
}