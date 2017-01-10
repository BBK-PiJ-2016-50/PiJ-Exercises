import org.junit.*;
import static org.junit.Assert.*;

public class QueueTest {
	
	PersonQueue queue = new ImplementPersonQueue();
	
	@Test
	public void testInsertAndRetrieve() {
		Person one = new Person("Ian", 32);
		Person two = new Person("Sam", 30);
		queue.insert(one);
		queue.insert(two);
		Person actual = queue.retrieve();
		assertEquals(one.getName(), actual.getName());
	}
	
}