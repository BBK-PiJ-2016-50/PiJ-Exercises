import org.junit.*; 
import static org.junit.Assert.*;

public class LibrariesTest {
	
	private Users Bob;
	private Users Tim;
	private Library newLib;
	private Book newBook;

	@Before
	public void buildUp() {
		Bob = new UsersImpl("Bob");
		Tim = new UsersImpl("Tim");
		newLib = new LibraryImpl("bbk lib", 5);
		newBook = new BookImpl("Narnia", "Lewis");
	}
	
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
	
	@Test
	public void testsGetName() {
		String output = Bob.getName();
		String expected = "Bob";
		assertEquals(expected, output);
	}
	
	@Test
	public void testsGetLibraryID() {
		int output = Bob.getLibraryID();
		int expected = 0;
		assertEquals(expected, output);
	}
	
	@Test
	public void testsRegister() {
		int bobOutput = Bob.register(newLib);
		int timOutput = Tim.register(newLib);
		int bobExpected = 1;
		int timExpected = 2;
		assertEquals(bobExpected, bobOutput);
		assertEquals(timExpected, timOutput);
	}
	
	@Test
	public void testsGetIDAfterRegister() {
		Bob.register(newLib);
		Tim.register(newLib);
		int bobOutput = Bob.getLibraryID();
		int timOutput = Tim.getLibraryID();
		int bobExpected = 1;
		int timExpected = 2;
		assertEquals(bobExpected, bobOutput);
		assertEquals(timExpected, timOutput);
	}
	
	@Test
	public void testsGetLibrary() {
		Bob.register(newLib);
		String output = Bob.getLibrary();
		String expected = "bbk lib";
		assertEquals(expected, output);
	}
		
	@Test
	public void testsMaxNumBooks() {
		int output = newLib.getMaxNumberOfBooks();
		int expected = 5;
		assertEquals(expected, output);
	}
	
	@Test
	public void testsAddBookAndTakeBook() {
		newLib.addBook("book1", "author1");
		String output = newLib.takeBook("book1").getTitle();
		String expected = "book1";
		assertEquals(expected, output);
	}
	
	@Test
	public void testsTakeBookNotAvailable() {
		newLib.addBook("book1", "author1");
		newLib.takeBook("book1");
		Book output = newLib.takeBook("book1");
		assertNull(output);
	}
	
	@Test
	public void testsNoExistentBook() {
		newLib.addBook("book1", "author1");
		Book output = newLib.takeBook("book2");
		assertNull(output);
	}
	
	@Test
	public void testsReturnBook() {
		newLib.addBook("book1", "author1");
		Book book = newLib.takeBook("book1");
		newLib.returnBook(book);
		boolean output = book.isTaken();
		assertFalse(output);
	}
	
	@Test
	public void testsGetReaderCount() {
		Bob.register(newLib);
		Tim.register(newLib);
		int output = newLib.getReaderCount();
		int expected = 2;
		assertEquals(expected, output);
	}

	@Test
	public void testsGetBookCount() {
		newLib.addBook("book1", "author1");
		newLib.addBook("book2", "author2");
		newLib.addBook("book3", "author3");
		int output = newLib.getBookCount();
		int expected = 3;
		assertEquals(expected, output);
	}
	
	@Test
	public void testsGetBorrowedCount() {
		newLib.addBook("book1", "author1");
		newLib.addBook("book2", "author2");
		newLib.addBook("book3", "author3");
		newLib.takeBook("book1");
		newLib.takeBook("book3");
		int output = newLib.getBookBorrowedCount();
		int expected = 2;
		assertEquals(expected, output);
	}

}