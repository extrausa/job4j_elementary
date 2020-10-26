package ru.job4j.pojo;
//3. Массивы и модели. [#363152]
import java.lang.ref.Cleaner;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Cleane code", 300);
        Book algoritm = new Book("Algoritm & people", 100);
        Book firstCode = new Book("First code", 400);
        Book javaBook = new Book("Java BOOK", 600);
        Book[] libro = new Book[4];
        libro[0] = cleanCode;
        libro[1] = firstCode;
        libro[2] = algoritm;
        libro[3] = javaBook;

        for (int i = 0; i < libro.length; i++) {
            Book fb = libro[i];
            System.out.println(fb.getNameBook() + " - " + fb.getCountPage());

        }
        System.out.println("Change index");

        libro[0] = javaBook;
        libro[3] = cleanCode;

        for (int i = 0; i < libro.length; i++) {
            Book fb = libro[i];
            System.out.println(fb.getNameBook() + " - " + fb.getCountPage());

        }
        System.out.println("Equals index");

        for (int i = 0; i < libro.length; i++) {
            Book fb = libro[i];
            if (fb.getNameBook().equals("Cleane code")) {
                System.out.println(fb.getNameBook() + " - " + fb.getCountPage());
            }


        }




    }
}
