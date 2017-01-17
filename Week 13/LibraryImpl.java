public class LibraryImpl implements Library {
	
	private String libName;
	private int maxBooks;
	private String[] users;
	private int userCount;
	private Book[] books;
	private int bookCount;
	
	public LibraryImpl(String name, int maxBooks) {
		this.libName = name;
		this.maxBooks = maxBooks;
		this.users = new String[5];
		this.userCount = 0;
		this.books = new Book[5];
		this.bookCount = 0;
	}
	
	public String getLibName() {
		return this.libName;
	}

	public int getID(String name) {
		for (int i = 0; i < userCount; i++) {
			if (users[i].equals(name)) {
				return i + 1;
			}
		}
		users[userCount] = name;
		userCount++;
		return userCount;
	}
	
	public int getMaxNumberOfBooks() {
		return this.maxBooks;
	}
	
	public void addBook(String title, String author) {
		Book newBook = new BookImpl(title, author);
		books[bookCount] = newBook;
		bookCount++;
	}
	
	public Book takeBook(String title) {
		for (int i = 0; i < bookCount; i++) {
			if (books[i].getTitle().equals(title)) {
				if (!books[i].isTaken()) {
					books[i].setTaken(true);
					return books[i];
				} else {
					return null;
				}
			}
		}
		return null;
	}
	
	public void returnBook(Book book) {
			book.setTaken(false);
	}
	
	public int getReaderCount() {
		return userCount;
	}
	
	public int getBookCount() {
		return bookCount;
	}
	
	public int getBookBorrowedCount() {
		int borrowed = 0;
		for (int i = 0; i < bookCount; i++) {
			if (books[i].isTaken()) {
				borrowed++;
			}
		}
		return borrowed;
	}
  
}