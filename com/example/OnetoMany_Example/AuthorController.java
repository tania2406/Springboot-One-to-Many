package com.example.OnetoMany_Example;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController 
{
	@Autowired
	AuthorRepository arepo;
@RequestMapping("/test")
public String test()
{
	return " this is test for one to many"; 
}
@RequestMapping("/save")
public String save()
{
	Author a=new Author();
	Book b=new Book();
	Book b2=new Book();
	Book b1=new Book();
	b.setBname("EBalaguruswamy");
	b1.setBname("Morrismano");
	b2.setBname("RsAgarwal");
	b.setAuthor(a);
	b1.setAuthor(a);
	b2.setAuthor(a);
	List<Book> book=Arrays.asList(b,b1,b2);
	a.setAname("tania");//setting author name
	a.setBook(book); // adding list of books to author
	arepo.save(a);
	return " data has been saved";
}
@RequestMapping("/all")
public List<Author> all()
{
	return arepo.findAll();
}
}
