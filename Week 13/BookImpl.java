public class BookImpl implements Book {
  
	private final String author;
	private final String title;
	private boolean isTaken;
  
	public BookImpl(String title, String author) {
		this.title = title;
		this.author = author;
		this.isTaken = false;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public boolean isTaken() {
		return isTaken;
	}
	
	public void setTaken(boolean taken) {
		isTaken = taken;
	}
  
}