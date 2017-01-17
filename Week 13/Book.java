public interface Book {

	/**
      * Gets author
	  */
	public String getAuthor();
  
	/**
      * Gets title
	  */
	public String getTitle();
	
	/**
	  * returns true if the book is available, false otherwise
	  */
	public boolean isTaken();
	
	/**
	  * sets to true if the book is available, false otherwise
	  */
	public void setTaken(boolean taken);

}