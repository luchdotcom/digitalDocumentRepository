package com.citb408_Spring2021.repo;

public class Document {
    private double size;
    private String format;
    private String title;

    public Document() {
    }

    public Document(double size, String format, String title) {
        this.size = size;
        this.format = format;
        this.title = title;
    }

    public double getSize() {
        return size;
    }

    public String getFormat() {
        return format;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Document{" +
                "size=" + size +
                ", format='" + format + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
