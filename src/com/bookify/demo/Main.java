package com.bookify.demo;

import java.sql.SQLException;
import java.util.List;

import com.bookify.util.DBConnection;
import com.bookify.model.BookCategory;
import com.bookify.dao.BookCategoryDao;

public class Main {

    public static void main(String[] args) {
        // sampleConnection();
        try {
            DBConnection dbConnection = DBConnection.getDbConnection();
            BookCategoryDao bookCategoryDao = new BookCategoryDao(dbConnection);
            List<BookCategory> bookCategorys = bookCategoryDao.findAll();
            bookCategorys.stream().forEach(System.out::println);

            // now compare any 2 bookCategorys
            // BookCategory BookCategory1 = bookCategorys.get(0);
            // BookCategory BookCategory2 = bookCategorys.get(0);
            // BookCategory BookCategory3 = bookCategorys.get(1);
            // System.out.println(BookCategory1 == BookCategory2);
            // System.out.println(BookCategory1 == BookCategory3);
            // System.out.println(BookCategory1.compareTo(BookCategory2));
            // System.out.println(BookCategory1.equals(BookCategory3));

            // bookCategorys.stream().forEach(System.out::println);
            // sort bookCategorys
            // bookCategorys.sort((BookCategory1, BookCategory2) -> BookCategory1.compareTo(BookCategory2));
            // NOW REVERSE SORT THIS
            // bookCategorys.sort((BookCategory1, BookCategory2) -> BookCategory2.compareTo(BookCategory1));
            // bookCategorys.stream().forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}