package com.citb408_Spring2021.repo;

public class Novel extends Book{
    private String novelAbstract;

    public Novel(double size, String format, String title, Author author, String isbn, String novelAbstract) {
        super(size, format, title, author, isbn);
        this.novelAbstract = novelAbstract;
    }

    public String getNovelAbstract() {
        return novelAbstract;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "novelAbstract='" + novelAbstract + '\'' +
                "} " + super.toString();
    }
}
