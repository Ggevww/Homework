package homework10.system_design.task1;

import java.util.Arrays;

/**
 * Represents a library that contains a collection of books.
 * Provides methods to add books and print the details of all books in the library.
 */
public class Library {
    protected String libraryName;
    private Book[] books;

    /**
     * Constructs a Library with the specified name and initializes an empty array of books.
     *
     * @param libraryName the name of the library
     */
    public Library(final String libraryName){
        this.libraryName = libraryName;
        this.books = new Book[0];
    }
     /**
     * Adds a book to the library's collection.
     *
     * @param book the book to add
     */
    public void addBook(Book book){
        books = Arrays.copyOf(books, books.length+1);
        books[books.length-1] = book;
    }
    /**
     * Returns the array of books in the library.
     *
     * @return an array of books
     */
    Book[] getBooks(){
        return books;
    }
    /**
     * Prints the details of all books in the library.
     * Displays the library name, author, title, and price of each book.
     *
     * @param books an array of books to print
     */
    void print(Book[] books){
        System.out.println("Library: " + this.libraryName);
        for (Book i : books){
            System.out.println("Author: " + i.getAuthor() + ", Title: " + i.getTitle() + ", Price: " + i.getPrice());
        }
    }




}
