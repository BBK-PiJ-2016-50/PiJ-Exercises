public interface Library {
	
	/**
	  * returns the library name
	  */
	public String getLibName();
	
	/**
	  * returns the max number od books to be borrowed from the library
	  */
	public int getMaxNumberOfBooks();
	
	/**
	  * returns the id of the user
	  */	
	public int getID(String userName);
	
	/**
	  * Adds a new book to the list of books in this library
	  */	
	public void addBook(String title, String author);
	
	/**
	  * If the book is not taken, marks the book as taken and returns it. If the book is taken or
	  * does not exist, null is returned.
	  */	
	public Book takeBook(String title);
	
	/**
	  * Marks the book as not taken
	  */
	public void returnBook(Book book);
}