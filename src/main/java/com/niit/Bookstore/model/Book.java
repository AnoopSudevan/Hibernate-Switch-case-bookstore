package com.niit.Bookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int bookid;
@Column(nullable=false,unique=true)
String bookname;
String authorname;
@Column(columnDefinition="text")
String bookbackcontent;
int price;
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAuthorname() {
	return authorname;
}
public void setAuthorname(String authorname) {
	this.authorname = authorname;
}
public String getBookbackcontent() {
	return bookbackcontent;
}
public void setBookbackcontent(String bookbackcontent) {
	this.bookbackcontent = bookbackcontent;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}


}
