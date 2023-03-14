package hw3;

import hw3.models.Book;
import hw3.models.Library;
import hw3.models.Magazines;

public class Main {
    public static void main(String[] args) {
        Library.add(new Book("adadada"));
        Library.add(new Book("qwerty"));
        Library.add(new Book("zxcvb"));
        Library.add(new Book("asdfg"));
        Library.add(new Magazines("cvbn"));
        Library.add(new Magazines("uiop"));
        Library.add(new Magazines("jkl"));


        Library.showBooks();
        System.out.print("--------------------");
        Library.showMagazines();
    }
}
