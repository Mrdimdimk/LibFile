package run;

import bean.Catalog;
import bean.book;
import lib.logic.LibraryServis;
import lib.logic.impl.CityLibraryService;

public class LibraryanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LibraryServis servise = new CityLibraryService();
Catalog bookCatalog = servise.getMainCatalog();
viewCatalogInfo(bookCatalog);

	}
	private static void viewCatalogInfo(Catalog catalog){
		for (book bo : catalog.getBooks()){
			System.out.println(bo);
		}
	}

}
