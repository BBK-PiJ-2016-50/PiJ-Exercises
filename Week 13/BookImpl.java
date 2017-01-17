public class BookImpl implements Book {
  
	private final String author;
	private final String title;
  
	public BookImpl(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
  
}