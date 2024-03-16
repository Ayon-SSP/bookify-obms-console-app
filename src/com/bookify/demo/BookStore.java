package com.bookify.demo;

import java.util.ArrayList;

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
            System.out.println(book);
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
}