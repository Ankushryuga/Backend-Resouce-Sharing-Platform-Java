package com.ankush.Resource_sharing_app.model;

//@Embeddable // indicating this class will be embedded in another entity..
public class Attachment {

    private String fileName;
    private String fileType;
    private long size;

    // Constructors, getters, setters
    public Attachment() {}

    public Attachment(String fileName, String fileType, long size) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.size = size;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
// Getters and setters
}
