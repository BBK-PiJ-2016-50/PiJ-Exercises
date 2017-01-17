public interface Library {
	
	/**
	  * returns the library name
	  */
	String getLibName();
	
	/**
	  * returns the max number od books to be borrowed from the library
	  */
	int getMaxNumberOfBooks();
	
	/**
	  * returns the id of the user
	  */	
	int getID(String userName);

}