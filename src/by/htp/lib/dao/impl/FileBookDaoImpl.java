package by.htp.lib.dao.impl;

import bean.book;
import by.htp.lib.dao.BookDao;

public class FileBookDaoImpl implements BookDao{

	@Override
	public book[] readAll() {
	book[] books = new book[5];
	
	 //change this code : take book from library.txt 
	books[0] = new book();
	books[1] = new book();
	books[2] = new book();
	books[3] = new book();
	books[4] = new book();
	return books;
	}

}
