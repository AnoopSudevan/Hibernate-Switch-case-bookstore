package com.niit.Bookstore.DAO;

import java.util.List;

import com.niit.Bookstore.model.Book;

public interface BookDAO {
	boolean addBook(Book b);
	boolean updatebook(Book b);
	boolean deletebook(Book b);
	Book SelectOneBook(String bookname);
	List<Book> selectAll();

}
