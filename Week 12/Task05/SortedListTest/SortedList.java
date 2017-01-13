public class SortedList {
	
	private IntObj firstNum = null;
	private IntObj current= null;
	
	public void addNum(IntObj num) {
		
		if (firstNum == null) {
			firstNum = num;
			return;
		}
		
		if (num.getIntValue() < firstNum.getIntValue()) {
			num.setNextNum(firstNum);
			firstNum = num;
			return;
		}
		
		current = this.firstNum;
	
		while (current.getNextNum() != null && current.getNextNum().getIntValue() < num.getIntValue()) {
			current = current.getNextNum();
		}
		num.setNextNum(current.getNextNum());
		current.setNextNum(num);
	}
	
	public String printList() {
		String printList = "";
		current = firstNum;
		do {
			printList += current.getIntValue();
			current = current.getNextNum();
		} while (current != null);
		return printList;
	}
	
}