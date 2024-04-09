// Create a class Author with the following information.

// Member variables: name (String), email (String), and gender (char)

// Parameterized Constructor: To initialize the variables

// Create a class Book with the following information.

// Member variables: name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)

// [Assumption: Each book will be written by exactly one Author]

// Parameterized Constructor: To initialize the variables

// Getters and Setters for all the member variables

// In the main method, create a book object and print all details of the book (including the author details)


class Author {
    private String name;
    private String email;
    private char gender;

    // Parameterized constructor to initialize the variables
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters and Setters for all the member variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    // Parameterized constructor to initialize the variables
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters and Setters for all the member variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}

public class class_assignment_3 {
    public static void main(String[] args) {
        // Create an author object
        Author author = new Author("John Doe", "john.doe@example.com", 'M');

        // Create a book object
        Book book = new Book("Java Programming", author, 29.99, 100);

        // Print all details of the book
        System.out.println("Book Details:");
        System.out.println("Name: " + book.getName());
        System.out.println("Author: " + book.getAuthor().getName());
        System.out.println("Email: " + book.getAuthor().getEmail());
        System.out.println("Gender: " + book.getAuthor().getGender());
        System.out.println("Price: $" + book.getPrice());
        System.out.println("Quantity in Stock: " + book.getQtyInStock());
    }
}