import org.junit.*;
import static org.junit.Assert.*;

public class PrimeDivisorListTest {
	
	PrimeDivisorList primeList; 
	
	@Before
	public void setUp() {
		primeList = new PrimeDivisorList();
	}
	
	@Test
	public void addPrimeNumbers() {
		primeList.add(3);
		primeList.add(5);
		primeList.add(7);
		primeList.add(3);
		String expected = "[ 2^3 * 5 * 7 = 315 ]";
		String output = primeList.toString();
		assertEquals(expected, output);
		
	}

	@Test
	public void removePrimeNumber() {
		primeList.add(3);
		primeList.add(5);
		primeList.add(7);
		primeList.remove(1);
		String expected = "[ 3 * 7 = 21 ]";
		String output = primeList.toString();
		assertEquals(expected, output);
	}
	
	@Test (expected = NullPointerException.class)
	public void addNullNumber() {
		primeList.add(3);
		primeList.add(null);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void addNonPrimeNumber() {
		primeList.add(3);
		primeList.add(4);
	}
	
}