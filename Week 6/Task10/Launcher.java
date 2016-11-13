public class Launcher {
	
	public static void main(String[] args) {

		IntObj num1 = new IntObj(10);
		IntObj num2 = new IntObj(2);
		IntObj num3 = new IntObj(3);
		IntObj num4 = new IntObj(56);
		IntObj num5 = new IntObj(34);
		IntObj num6 = new IntObj(4);
		IntObj num7 = new IntObj(4);
		IntObj num8 = new IntObj(43);
		IntObj num9 = new IntObj(434);
		IntObj num10 = new IntObj(876);
		IntObj num11= new IntObj(78);
		IntObj num12 = new IntObj(7868);
		IntObj num13 = new IntObj(22);
		IntObj num14 = new IntObj(5);
		IntObj num15 = new IntObj(9);
		IntObj num16 = new IntObj(78);
		
		SortedList sList = new SortedList();
		sList.addNum(num1);
		sList.addNum(num2);
		sList.addNum(num3);
		sList.addNum(num4);
		sList.addNum(num5);
		sList.addNum(num6);
		sList.addNum(num7);
		sList.addNum(num8);
		sList.addNum(num9);
		sList.addNum(num10);
		sList.addNum(num11);
		sList.addNum(num12);
		sList.addNum(num13);
		sList.addNum(num14);
		sList.addNum(num15);
		sList.addNum(num16);
		
		sList.printList();
	}
	
}