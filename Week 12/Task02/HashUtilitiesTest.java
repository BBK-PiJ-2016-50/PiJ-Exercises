import org.junit.*;
import static org.junit.Assert.*;

public class HashUtilitiesTest {
	
	@Test
	public void testsShortHash() {
		String str = "dsgfdjdhj";
		int hash = str.hashCode();
		int shortHash = HashUtilities.shortHash(hash);
		assertEquals(50, shortHash);

	}
	
}