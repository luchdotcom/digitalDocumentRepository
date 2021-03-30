package com.citb408_Spring2021;

import com.citb408_Spring2021.repo.Document;
import com.citb408_Spring2021.repo.Author;
import com.citb408_Spring2021.repo.NewsPaper;
import com.citb408_Spring2021.repo.Book;
import com.citb408_Spring2021.repo.Repo;
import com.citb408_Spring2021.building.Building;
import com.citb408_Spring2021.building.Room;
import com.citb408_Spring2021.building.Premise;
public class Main {

    public static void main(String[] args) {
        Document document= new Document();
        Document document1=new Document(3.4,"pdf","Doc 2");
        System.out.println(document);
        System.out.println(document1);

        Author author= new Author("Vazov");
        Book book=new Book();
        Book book1=new Book(4.2,"txt", "Booc2",author,"A1234");

        System.out.println(book);
        System.out.println(book1);

        Repo repo=new Repo(10,0,0);
        repo.uploadDocument(document);
        System.out.println(repo);
        repo.uploadDocument(document1);
        System.out.println(repo);

        repo.uploadDocument(book);
        System.out.println(repo);

        repo.uploadDocument(book1);
        System.out.println(repo);

        repo.uploadDocument(book1);
        System.out.println(repo);
        NewsPaper newsPaper=new NewsPaper(2,"pdf","24chasa",25);
        repo.uploadDocument(newsPaper);
        System.out.println(repo);

        Document document2;
        document2=book1;
        System.out.println(document2);
        document2=document1;
        System.out.println(document2);
        document2=newsPaper;
        System.out.println(document2);


        Building building=new Building(200);
        Premise premise=new Premise(10,building);
        premise.capacity();

        Room room=new Room(15,building,2);
        room.capacity();
        premise=room;
        premise.capacity();
    }
}
