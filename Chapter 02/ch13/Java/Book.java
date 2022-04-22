package ch13;

public class Book {
	
	private static int number = 100;
	
	private String name;
	private String author;
	private int bookNumber;
	
	public Book() {
		
	}
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
		this.bookNumber = number++;
	}
	
	public void showInfo() {
		System.out.println("책 제목은 " + name + "이고, 책 저자는 " + author + "이며, 책 번호는 " + bookNumber + "입니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
}
