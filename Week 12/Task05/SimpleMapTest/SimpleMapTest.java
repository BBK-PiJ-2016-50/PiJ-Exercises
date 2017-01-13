import org.junit.*;
import static org.junit.Assert.*;

public class SimpleMapTest {
	
	SimpleMap map = new ImplementSimpleMap();
	
	@Test
	public void testsIsEmpty() {
		boolean output = map.isEmpty();
		assertTrue(output);
	}
	
	@Test
	public void testsPutAndGet() {
		map.put(0, "Ian");
		map.put(1, "Sam");
		map.put(2, "Mark");
		String expected = "Sam";
		String output = map.get(1);
		assertEquals(expected, output);
	}
	
	@Test
	public void testsRemove() {
		map.put(0, "Ian");
		map.put(1, "Sam");
		map.put(2, "Mark");
		map.remove(0);
		String expected = null;
		String output = map.get(0);
		assertEquals(expected, output);
	}
	
	@Test
	public void testsInUseKey() {
		map.put(0, "Ian");
		map.put(1, "Sam");
		map.put(2, "Mark");
		map.put(2, "Kate");
		String expected = "Mark";
		String output = map.get(2);
		assertEquals(expected, output);
	}

}