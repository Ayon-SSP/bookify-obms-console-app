package com.bookify.demo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.bookify.model.Author;
import com.bookify.model.Book;
import com.bookify.model.BookCategory;
import com.bookify.model.Genre;

public class BookStore {

    private static BookStore bookStore;

    private ArrayList<BookCategory> bookCategories = new ArrayList<>();
    private ArrayList<Genre> genres = new ArrayList<>();
    private ArrayList<Author> authors = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();

    private BookStore() {
        super();
    }

    public static synchronized BookStore getInstance() {
        if (bookStore == null) {
            bookStore = new BookStore();
        }
        return bookStore;
    }

    public void addBookCategory(BookCategory bookCategory) {
        bookCategories.add(bookCategory);
    }

    public void addGenre(Genre genre) {
        genres.add(genre);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public BookCategory getBookCategory(String bookCategoryId) {
        for (BookCategory bookCategory : bookCategories) {
            if (bookCategory.getCategoryId().equals(bookCategoryId)) {
                return bookCategory;
            }
        }
        return null;
    }

    public Genre getGenre(String genreId) {
        for (Genre genre : genres) {
            if (genre.getGenreId().equals(genreId)) {
                return genre;
            }
        }
        return null;
    }

    public Author getAuthor(String authorId) {
        for (Author author : authors) {
            if (author.getAuthorId().equals(authorId)) {
                return author;
            }
        }
        return null;
    }

    public Book getBook(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.getBookId() + " -> " + book);
        }
    }

    public void displayBookCategories() {
        for (BookCategory bookCategory : bookCategories) {
            System.out.println(bookCategory);
        }
    }

    public void displayGenres() {
        for (Genre genre : genres) {
            System.out.println(genre);
        }
    }

    public void displayAuthors() {
        for (Author author : authors) {
            System.out.println(author);
        }
    }

    public static void generateTestData() {

        BookCategory bookCategory = new BookCategory("bc00001", "Magazines",
                "Magazines usually periodical publications", "Magazines.jpg");
        BookCategory bookCategory2 = new BookCategory("bc00002", "Comics", "Comics usually periodical publications",
                "Comics.jpg");
        bookStore.addBookCategory(bookCategory);
        bookStore.addBookCategory(bookCategory2);

        Genre genre = new Genre("ge00001", "Fiction",
                "Fiction is the form of any narrative or informative work that deals", "Fiction.jpg");
        Genre genre2 = new Genre("ge00002", "Non-Fiction",
                "Non-Fiction is the form of any narrative or informative work that deals", "Non-Fiction.jpg");
        Genre genre3 = new Genre("ge00003", "Science Fiction",
                "Science Fiction is the form of any narrative or informative work that deals", "Science-Fiction.jpg");
        bookStore.addGenre(genre);
        bookStore.addGenre(genre2);
        bookStore.addGenre(genre3);

        Author author = new Author("au00001", "J.K. Rowling",
                "J.K. Rowling is a British author, screenwriter, producer, and philanthropist", 9.5, "jkrowling.jpg",
                "31 July 1965");
        bookStore.addAuthor(author);

        Set<Genre> genres = new HashSet<>();
        genres.add(genre);
        genres.add(genre2);
        genres.add(genre3);

        Book book = new Book("b00001", author, bookCategory, genres, "Harry Potter and the Philosopher's Stone",
                "Harry Potter and the Philosopher's Stone", new Date(0), 1299, false, 567, 0.05, 200, "English",
                "Publisher", "ISBN", "img.jpg");
        Book book2 = new Book("b00002", author, bookCategory2, genres, "Harry Potter and the Philosopher's Stone",
                "Harry Potter and the Philosopher's Stone", new Date(0), 1299, false, 567, 0.05, 200, "English",
                "Publisher", "ISBN", "img.jpg");
        bookStore.addBook(book);
        bookStore.addBook(book2);
    }
}