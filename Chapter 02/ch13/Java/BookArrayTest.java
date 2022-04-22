package ch13;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[3];
		Book[] copyLibrary = new Book[3];
		
		library[0] = new Book("»ï±¹Áö1", "Ä§Âø¸Ç");
		library[1] = new Book("»ï±¹Áö2", "Ä§Âø¸Ç");
		library[2] = new Book("»ï±¹Áö3", "Ä§Âø¸Ç");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		
		copyLibrary[0].setName("¾î¸°¿ÕÀÚ");
		copyLibrary[0].setAuthor("»ýÅÃÁãÆä¸®");
		
		int i = 0;
		for (Book book : library) {
			copyLibrary[i++] = book;
		}
		i = 0;
		
		for (Book book : copyLibrary) {
			book.showInfo();
		}
	}

}
