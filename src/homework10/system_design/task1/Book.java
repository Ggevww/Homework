package homework10.system_design.task1;

/**
 * Represents a book with a title, author, and price.
 * Provides methods to get the book's details and set its price.
 */
public class Book {
    private String title;
    private String author;
    private double price;

    /**
     * Gets the title of the book.
     *
     * @return the title of the book
     */
    public String getTitle(){
        return this.title;
    }

    /**
     * Gets the author of the book.
     *
     * @return the author of the book
     */
    public String getAuthor(){
        return this.author;
    }

    /**
     * Sets the title of the book.
     *
     * @param title the title to set
     */
    public double getPrice(){
        return this.price;
    }
    /**
     * Sets the author of the book.
     *
     * @param author the author to set
     */
    public void setPrice(final double price ){
        this.price = price;
    }

    /**
     * Constructs a Book with the specified title, author, and price.
     *
     * @param title  the title of the book
     * @param author the author of the book
     * @param price  the price of the book
     */
    public Book(final String title, final String author, final double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    /**
     * Constructs a Book with the specified title and author, and a default price of 1500.
     *
     * @param title  the title of the book
     * @param author the author of the book
     */
    public Book(final String title, final String author){
        this(title, author, 1500);
    }


}
