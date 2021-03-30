package com.citb408_Spring2021.repo;

public class PoemsColection extends Book{
    private int numberOfPoems;

    public PoemsColection(double size, String format, String title, Author author, String isbn, int numberOfPoems) {
        super(size, format, title, author, isbn);
        this.numberOfPoems = numberOfPoems;
    }

    public int getNumberOfPoems() {
        return numberOfPoems;
    }

    @Override
    public String toString() {
        return "poemsColection{" +
                "numberOfPoems=" + numberOfPoems +
                "} " + super.toString();
    }
}
