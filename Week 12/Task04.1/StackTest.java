import org.junit.*;
import static org.junit.Assert.*;

public class StackTest {
	
	Stack<Integer> myStack = new ImplStack<>();
	
	@Test
	public void testIsEmpty() {
		boolean actual = myStack.isEmpty();
		assertTrue(actual);
	}
	
	@Test
	public void testPushAndPop() {
		int expectedInt = 3;
		myStack.push(expectedInt);
		int actualInt = myStack.pop();
		assertEquals(expectedInt, actualInt);
	}
	
}