package com.niit.Bookstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.niit.Bookstore.DAO.BookDAO;
import com.niit.Bookstore.DAO.BookDAOimpl;
import com.niit.Bookstore.model.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BookDAO d=new BookDAOimpl();
        Book b=new Book();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value:1 - Add book, 2- View Book, 3 - Edit book, 4 - Delete book  ");
        String val = in.nextLine();
        System.out.println(val);
        switch (val) {
		case "1":
			System.out.println("Enter bookname");
			b.setBookname(in.nextLine());
    		System.out.println("Enter authorname");
    		b.setAuthorname(in.nextLine());
    		System.out.println("Enter bookbackcontent");
    		b.setBookbackcontent(in.nextLine());
    		System.out.println("Enter bookprice");
    		b.setPrice(in.nextInt());
    		d.addBook(b);
			break;
		case "2":
			ArrayList<Book> booklist=(ArrayList<Book>) d.selectAll();
			Iterator<Book> iterator=booklist.iterator();
			while(iterator.hasNext())
			{
				Book b1=iterator.next();
				System.out.println(b1.getBookname()+"\t"+b1.getAuthorname()+"\t"+b1.getBookbackcontent()+"\t"+b1.getPrice());
			}
			break;
		case "3":
			System.out.println("Enter bookname to delete");
			String booknm=in.nextLine();
			Book b2=d.SelectOneBook(booknm);
			d.deletebook(b2);
			break;	
		case "4":
			System.out.println("Enter bookname to update");
			String booknm3=in.nextLine();
			Book b3=d.SelectOneBook(booknm3);
			System.out.println("Enter the new price");
			b3.setPrice(in.nextInt());
			d.updatebook(b3);
			break;	
		default:
			break;
		}
        	
        }
        
    }
