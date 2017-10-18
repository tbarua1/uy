package creational.prototype;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShop implements Cloneable{
private String shopName;
private List<Book> book=new  ArrayList<Book>();
public String getShopName() {
	return shopName;
}
public void setShopName(String shopName) {
	this.shopName = shopName;
}
public List<Book> getBook() {
	return book;
}
public void setBook(List<Book> book) {
	this.book = book;
}
@Override
public String toString() {
	return "BookShop [shopName=" + shopName + ", book=" + book + "]";
}
public void loadData(){
	for(int i=0;i<=10;i++){
		Book book =new Book();
		book.setBid(i);
		book.setBname("Book "+i);
		getBook().add(book);
	}
}
/*@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}*/
@Override
protected BookShop clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
        //Object o;
	BookShop bookShop=new BookShop();
	for (Book book2 : this.getBook()) {
		bookShop.getBook().add(book2);
	}
	return bookShop;
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}
@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}

}
