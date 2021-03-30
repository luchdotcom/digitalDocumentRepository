package com.citb408_Spring2021.repo;

public class NewsPaper extends Document{
    private int numberOfArticles;

    public NewsPaper(double size, String format, String title, int numberOfArticles) {
        super(size, format, title);
        this.numberOfArticles = numberOfArticles;
    }

    @Override
    public String toString() {
        return "NewsPaper{" +
                "numberOfArticles=" + numberOfArticles +
                "} " + super.toString();
    }

    public int getNumberOfArticles() {
        return numberOfArticles;
    }
}
