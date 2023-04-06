package com.example.demo.bean;
/**
 * Copyright 2021 bejson.com
 */

public class ImageFiles {

    private String imageFileName;
    private String imageFileSize;
    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileSize(String imageFileSize) {
        this.imageFileSize = imageFileSize;
    }
    public String getImageFileSize() {
        return imageFileSize;
    }

    @Override
    public String toString() {
        return "ImageFiles{" +
                "imageFileName='" + imageFileName + '\'' +
                ", imageFileSize='" + imageFileSize + '\'' +
                '}';
    }
}