package com.bookify.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bookify.model.BookCategory;
import com.bookify.util.DBConnection;

public class BookCategoryDao implements IDao<BookCategory> {
    private DBConnection dbConnection;
    private List<BookCategory> bookCategories = new ArrayList<>();

    public BookCategoryDao() {
        super();
    }

    public BookCategoryDao(DBConnection dbConnection) {
        super();
        this.dbConnection = dbConnection;
    }

    @Override
    public BookCategory create(BookCategory t) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public boolean update(int id, BookCategory t) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete(int id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public BookCategory findOne(int id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public List<BookCategory> findAll() throws Exception {
        Connection connection = dbConnection.getConnection();
        Statement selectStatement = connection.createStatement();

        final String selectQuery = "SELECT * FROM tbl_book_category";
        ResultSet resultSet = selectStatement.executeQuery(selectQuery);

        while (resultSet.next()) {

            BookCategory bookCategorys = new BookCategory(resultSet.getString("category_id"), resultSet.getString("category_name"),
                    resultSet.getString("category_description"), resultSet.getString("category_image"));
            bookCategories.add(bookCategorys);
        }

        if (bookCategories.isEmpty())
            return null;
        return bookCategories;

    }
}
