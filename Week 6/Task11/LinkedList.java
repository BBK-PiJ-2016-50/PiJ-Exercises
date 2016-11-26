public class LinkedList {
	
	private IntObj firstNum = null;
	private IntObj current = null;
	
	public IntObj addInt(int num) {
		IntObj newNum = new IntObj(num);
		if (firstNum == null) {
			firstNum = newNum;
		} else {
			current = firstNum;
			while (current.getNextNum() != null) {
				current = current.getNextNum();
			}
			current.setNextNum(newNum);
			newNum.setPrevNum(current);
		}
		return newNum;
	}
	
	public void printList() {
		current = firstNum;
		
		do {
			System.out.println ("Int: " + current.getIntValue());
			current = current.getNextNum();
		} while (current != null);
	}
	
	public IntObj getFirstItem() {
		if (firstNum != null) {
			return firstNum;
		} else {
			return null;
		}
		
	}
	
}