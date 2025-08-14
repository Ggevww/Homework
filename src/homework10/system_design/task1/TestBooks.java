package homework10.system_design.task1;

public class TestBooks {
    public static void main(String[] args) {
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 10000);
        Book book2 = new Book("1984", "George Orwell", 4500);
        Book book3 = new Book("Crime and Punishment", "Fyodor Dostoevsky", 3000);
        Book book4 = new Book("Davit Bek", "Raffi");
        Book book5 = new Book("Dead Souls", "Nikolai Gogol");
        Library library1 = new Library("Home library");
        Library library2 = new Library("City central library");

        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library2.addBook(book3);
        library2.addBook(book4);
        library2.addBook(book5);

        library1.print(library1.getBooks());
        library2.print(library2.getBooks());
    }
}
