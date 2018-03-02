package bean;

import java.util.Date;

public class Catalog {
private book[] books;
private String title;
private Date crateDate;


public Catalog(){
	super();
}
public Catalog(book[] books, String title, Date createDate){
	super();
}
public book[] getBooks() {
	return books;
}
public void setBooks(book[] books) {
	this.books = books;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Date getCrateDate() {
	return crateDate;
}
public void setCrateDate(Date crateDate) {
	this.crateDate = crateDate;
}

}
