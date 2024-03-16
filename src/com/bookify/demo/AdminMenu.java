package com.bookify.demo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import com.bookify.model.Author;
import com.bookify.model.Book;
import com.bookify.model.BookCategory;
import com.bookify.model.Genre;

public class AdminMenu {

    private static AdminMenu adminMenu;
    private static BookStore bookStore = BookStore.getInstance();
    private static Scanner sc = new Scanner(System.in);

    private AdminMenu() {
        super();
    }

    public static synchronized AdminMenu getInstance() {
        if (adminMenu == null) {
            adminMenu = new AdminMenu();
        }
        return adminMenu;
    }

    public void displayAdminMenu() {
        System.out.println("1. Add Book Category");
        System.out.println("2. Add Genres");
        System.out.println("3. Add Author");
        System.out.println("4. Add Book");
        System.out.println("5. Display Book Categories");
        System.out.println("6. Display Genres");
        System.out.println("7. Display Authors");
        System.out.println("8. Display Books");
        System.out.println("9. Exit");
    }

    public void performAdminMenu() {
        BookStore bookStore = BookStore.getInstance();
        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice){
            case 1:
                createCategory();
                break;
            case 2:
                createGenre();
                break;
            case 3:
                createAuthor();
                break;
            case 4:
                createBook();
                break;
            case 5:
                bookStore.displayBookCategories();
                break;
            case 6:
                bookStore.displayGenres();
                break;
            case 7:
                bookStore.displayAuthors();
                break;
            case 8:
                bookStore.displayBooks();
                break;
            case 9:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static void createCategory(){
        System.out.println("Enter book category id, name, description: "); // ip: bc00001, Magazines, Magazines usually periodical publications, Magazines.jpg
        String categoryFields = sc.nextLine();
        String[] categoryArray = categoryFields.split(", ");
        BookCategory bookCategory = new BookCategory(categoryArray[0], categoryArray[1], categoryArray[2], categoryArray[3]);
        bookStore.addBookCategory(bookCategory);
        System.out.println("Book Category added successfully ✅");      
    }

    private static void createGenre(){
        System.out.println("Enter genre id, name, description: "); // ip: ge00001, Fiction, Fiction is the form of any narrative or informative work that deals, Fiction.jpg
        String genreFields = sc.nextLine();
        String[] genreArray = genreFields.split(", ");
        Genre genre = new Genre(genreArray[0], genreArray[1], genreArray[2], "img.jpg");
        bookStore.addGenre(genre);
        System.out.println("Genre added successfully ✅");
    }

    private static void createAuthor(){
        System.out.println("Enter author id, name, bio: "); // ip: au00001, J.K. Rowling, J.K. Rowling is a British author, screenwriter, producer, and philanthropist, 9.5, jkrowling.jpg, 31 July 1965
        String authorFields = sc.nextLine();
        String[] authorArray = authorFields.split(", ");
        Author author = new Author(authorArray[0], authorArray[1], authorArray[2], 0, "img.jpg", "01/01/2000");
        bookStore.addAuthor(author);
        System.out.println("Author added successfully ✅");
    }

    private static void createBook(){
        System.out.println("Enter book id, author id, category id, genre id's, description, price, discount, available quantity: "); 
        String[] bookFields = sc.nextLine().split(", "); // ip: b00001, au00001, bc00001, ge00001 ge00002 ge00003, Harry Potter and the Philosopher's Stone, Harry Potter and the Philosopher's Stone, 1299, 0.05, 200
        // // ge00001 ge00002 ge00003 -> [objects...]
        ArrayList<Genre> genres = new ArrayList<>();
        for(String genreId : bookFields[3].split(" ")){
            genres.add(bookStore.getGenre(genreId));
        }

        for (String string : bookFields) {
            System.out.println(string);
        }
        
        /*
    private String bookId;
    private Author author;
    private BookCategory category;
    private List<Genre> genres;
    private String bookTitle;
    private String bookDescription;
    private Date bookPublishDate;
    private double bookPrice;
    private boolean discontinued;
    private int bookPages;
    private double bookDiscount;
    private int availableQuantity;
    private String bookLanguage;
    private String bookPublisher;
    private String bookIsbn;
    private String bookCoverImage;

    public Book() {
        super();
    }

    public Book(String bookId, Author author, BookCategory category, List<Genre> genres, String bookTitle, String bookDescription, Date bookPublishDate, double bookPrice, boolean discontinued, int bookPages, double bookDiscount, int availableQuantity, String bookLanguage, String bookPublisher, String bookIsbn, String bookCoverImage) {
        this.bookId = bookId;
        this.author = author;
        this.category = category;
        this.genres = genres;
        this.bookTitle = bookTitle;
        this.bookDescription = bookDescription;
        this.bookPublishDate = bookPublishDate;
        this.bookPrice = bookPrice;
        this.discontinued = discontinued;
        this.bookPages = bookPages;
        this.bookDiscount = bookDiscount;
        this.availableQuantity = availableQuantity;
        this.bookLanguage = bookLanguage;
        this.bookPublisher = bookPublisher;
        this.bookIsbn = bookIsbn;
        this.bookCoverImage = bookCoverImage;
    }
         */

        Book book = new Book(bookFields[0], 
            bookStore.getAuthor(bookFields[1]), 
            bookStore.getBookCategory(
                bookFields[2]), 
                genres, 
                bookFields[4], 
                bookFields[5], 
                new Date(0), 
                Integer.parseInt(bookFields[6]), 
                false, 
                567, 
                Double.parseDouble(bookFields[7]), 
                Integer.parseInt(bookFields[8]), 
                "English", 
                "Publisher", 
                "ISBN", 
                "img.jpg"
            );
        // Book(String bookId, Author author, BookCategory category, List<Genre> genres, String bookTitle, String bookDescription, Date bookPublishDate, double bookPrice, boolean discontinued, int bookPages, double bookDiscount, int availableQuantity, String bookLanguage, String bookPublisher, String bookIsbn, String bookCoverImage) {
        System.out.println(book.toString());
        
        bookStore.addBook(book);
        System.out.println("Book added successfully ✅");
    }
}