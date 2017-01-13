import org.junit.*;
import static org.junit.Assert.*;

public class SortedTest {
	
	SortedList list = new SortedList();
	
	@Test
	public void testsAddNum() {
		list.addNum(new IntObj(5));
		list.addNum(new IntObj(6));
		list.addNum(new IntObj(1));
		list.addNum(new IntObj(9));
		list.addNum(new IntObj(0));
		list.addNum(new IntObj(7));
		String expected = "015679";
		String output = list.printList();
		assertEquals(expected, output);
	}

}