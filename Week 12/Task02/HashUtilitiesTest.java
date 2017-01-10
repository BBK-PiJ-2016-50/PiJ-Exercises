import org.junit.*;
import static org.junit.Assert.*;

public class HashUtilitiesTest {
	
	@Test
	public void testShortHashWorks() {
		int num = 436546;
		int shortHash = HashUtilities.shortHash(num);
		assertTrue(shortHash < 1000);
	}
	
	@Test
	public void testShortHashAbove() {
		int num = 1001;
		int shortHash = HashUtilities.shortHash(num);
		assertEquals(1, shortHash);
	}
	
	@Test
	public void testShortHashBelow() {
		int num = 999;
		int shortHash = HashUtilities.shortHash(num);
		assertEquals(999, shortHash);
	}

	@Test
	public void testShortHashEqual() {
		int num = 1000;
		int shortHash = HashUtilities.shortHash(num);
		assertEquals(0, shortHash);
	}
	
	@Test
	public void testShortHashZero() {
		int num = 0;
		int shortHash = HashUtilities.shortHash(num);
		assertEquals(0, shortHash);
	}
	
	@Test
	public void testShortHashMassive() {
		int num = 999934243;
		int shortHash = HashUtilities.shortHash(num);
		assertEquals(243, shortHash);
	}
	
	@Test
	public void testShortHashNegative() {
		int num = -34673;
		int shortHash = HashUtilities.shortHash(num);
		assertEquals(673, shortHash);
	}
	
}