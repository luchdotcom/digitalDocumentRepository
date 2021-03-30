package com.citb408_Spring2021.repo;

public class Repo {
    private double maxSize;
    private int numberOfDocument;
    private double currentSize;

    public double getMaxSize() {
        return maxSize;
    }

    public int getNumberOfDocument() {
        return numberOfDocument;
    }

    public double getCurrentSize() {
        return currentSize;
    }

    public Repo(double maxSize, int numberOfDocument, double currentSize) {
        this.maxSize = maxSize;
        this.numberOfDocument = numberOfDocument;
        this.currentSize = currentSize;
    }
    public void uploadDocument(Document document){
        if (this.maxSize- this.currentSize >= document.getSize()){
            this.currentSize+=document.getSize();
            this.numberOfDocument++;
            System.out.println(document.getTitle()+" is uploaded!");

        }
        else{
            System.out.println("Not enough space!");
        }

    }

    @Override
    public String toString() {
        return "Repo{" +
                "maxSize=" + maxSize +
                ", numberOfDocument=" + numberOfDocument +
                ", currentSize=" + currentSize +
                '}';
    }
}
