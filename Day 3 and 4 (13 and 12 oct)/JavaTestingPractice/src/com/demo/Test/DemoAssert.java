package com.demo.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.demo.model.Book;
import com.demo.services.BookService;

class DemoAssert {

@Test 
public void assertrueMsg() {
	BookService bookservice = new BookService();
	Book HOD = new Book("1","300 years before GoT","gerorge rr martin");
	List<Book>  listOfBooks = bookservice.books();
	listOfBooks.add(HOD);
	assertTrue(listOfBooks.isEmpty());
}

}
