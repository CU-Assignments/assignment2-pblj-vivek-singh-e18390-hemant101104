class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    // Constructor
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    // Method to display fiction book details
    @Override
    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        super.displayDetails();
    }
}

class NonFiction extends Book {
    // Constructor
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    // Method to display non-fiction book details
    @Override
    public void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        super.displayDetails();
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating Fiction and Non-Fiction book objects
        Fiction fictionBook = new Fiction("Harry Potter", "J.K. Rowling", 500);
        NonFiction nonFictionBook = new NonFiction("Sapiens", "Yuval Noah Harari", 700);

        // Displaying book details
        fictionBook.displayDetails();
        System.out.println();
        nonFictionBook.displayDetails();
    }
}
