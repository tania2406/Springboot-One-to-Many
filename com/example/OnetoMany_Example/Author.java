package com.example.OnetoMany_Example;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="author")
public class Author
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String Aname;
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
		@OneToMany(cascade=CascadeType.ALL)
	List<Book> book;
	

}
