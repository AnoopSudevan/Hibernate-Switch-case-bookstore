package com.niit.Bookstore.DAO;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.niit.Bookstore.config.Hibernateconfig;
import com.niit.Bookstore.model.Book;

public class BookDAOimpl implements BookDAO {
	SessionFactory sessionfactory;

	@Override
	public boolean addBook(Book b) {
		try {
			SessionFactory sessionFactory = Hibernateconfig.createSessionFactory();
			Session s = sessionFactory.openSession();
			org.hibernate.Transaction txt = s.beginTransaction();
			s.save(b);
			txt.commit();
			s.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updatebook(Book b) {
		try {
			SessionFactory sessionFactory = Hibernateconfig.createSessionFactory();
			Session s = sessionFactory.openSession();
			org.hibernate.Transaction txt = s.beginTransaction();
			s.update(b);
			txt.commit();
			s.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deletebook(Book b) {
		try {
			SessionFactory sessionFactory = Hibernateconfig.createSessionFactory();
			Session s = sessionFactory.openSession();
			org.hibernate.Transaction txt = s.beginTransaction();
			s.delete(b);
			txt.commit();
			s.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Book SelectOneBook(String bookname) {
		try {
			SessionFactory sessionFactory = Hibernateconfig.createSessionFactory();
			Session s = sessionFactory.openSession();
			org.hibernate.Transaction txt = s.beginTransaction();
			Book b = (Book) s.createQuery("from Book where bookname ='" + bookname + "'").uniqueResult();
			txt.commit();
			s.close();
			return b;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Book> selectAll() {
		try {
			SessionFactory sessionFactory = Hibernateconfig.createSessionFactory();
			Session s = sessionFactory.openSession();
			org.hibernate.Transaction txt = s.beginTransaction();
			List<Book> b = s.createQuery("from Book").list();
			txt.commit();
			s.close();
			return b;
		} catch (Exception e) {
			return null;
		}
	}

}
