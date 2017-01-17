import org.junit.*; 
import static org.junit.Assert.*;

public class BooksTest {

	Books newBook = new Books("Narnia", "Lewis");
	
	@Test
	public void testsGetTitle() {
		String output = newBook.getTitle();
		String expected = "Narnia";
		assertEquals(expected, output);
	}
	
	@Test
	public void testsGetAuthor() {
		String output = newBook.getAuthor();
		String expected = "Lewis";
		assertEquals(expected, output);
	}

}