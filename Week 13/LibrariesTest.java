import org.junit.*; 
import static org.junit.Assert.*;

public class LibrariesTest {
	
	private Users Bob;
	private Users Tim;
	private Library newLib;

	@Before
	public void buildUp() {
		Bob = new UsersImpl("Bob");
		Tim = new UsersImpl("Tim");
		newLib = new LibraryImpl("bbk lib", 5);
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

}