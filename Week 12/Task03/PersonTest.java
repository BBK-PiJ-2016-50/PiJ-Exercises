import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	
	@Test
	public void testsNormalName() {
		Person p = new Person();
		String input = "Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(expected, output);
	}
	
	@Test
	public void testsDoubleSpace() {
		Person p = new Person();
		String input = "Dereck  Robert";
		String output = p.getInitials(input);
		String expected = "DR";
		assertEquals(expected, output);
	}
	
}