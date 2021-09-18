package com.company;
class Library{
    public String[] books;
    public int no_of_books = 0;
    Library(){
        this.books = new String[100];
    }

    public void addBooks(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book + " has been added ");
    }

    public void avaliableBooks() {
        System.out.println("avaliable book in library");
        for (String book:books
             ) {
            if(book ==null)
            {
                break;
            }
            System.out.println("* " + book);
        }

        }
    public void issueBook(String book){
        for (int i =0 ; i<this.books.length ; i++)
        {
            if(books[i]==book)
            {
                System.out.println(book + "this is issued to you");
                books[i] = null;
                return;
            }
        }
        System.out.println("book not found");

    }
    void returnBook(String book){
        addBooks(book);
    }
}

public class CWS_online_library {
    public static void main(String[] args) {
        //you have to implement a library using java class library
        //methods : issue book  , return book , show avaliable books , add books
        //properties : array to store  the available books
        // array to store the issued books
        Library bookbank = new Library();
        bookbank.addBooks("think with your mind");
        bookbank.addBooks("c++");
        bookbank.addBooks("python");

        bookbank.avaliableBooks();
        bookbank.issueBook("c++");
    }
}
