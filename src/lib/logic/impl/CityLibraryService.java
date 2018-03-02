package lib.logic.impl;

import bean.Catalog;
import bean.book;
import by.htp.lib.dao.BookDao;
import by.htp.lib.dao.impl.FileBookDaoImpl;
import lib.logic.LibraryServis;

public class CityLibraryService implements LibraryServis {
	private BookDao dao = new FileBookDaoImpl();

	@Override
	public Catalog getMainCatalog() {
		Catalog catalog = new Catalog();
		book[] books = dao.readAll();
		catalog.setBooks(books);
		catalog.setTitle("HTP_TAT_7_CATALOG");
		return catalog;
	}

}
