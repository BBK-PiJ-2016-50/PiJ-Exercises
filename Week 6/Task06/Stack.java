public class Stack {
	
	private IntObj firstNum = null;
	private IntObj current = null;

	//push integer into stack
	public void push(int num) {
		IntObj newNum = new IntObj(num);
		System.out.println("Pushing " + newNum.getIntValue() + "...");
		if (firstNum == null) {
			firstNum = newNum;
			return;
		}
		current = firstNum;
		while (current.getNextNum() != null) {
			current = current.getNextNum();
		}
		current.setNextNum(newNum);	
	}
	
	//retrieve most recently added integer from stack
	public IntObj pop() {
		IntObj popped = null;
		if (empty()) {
			System.out.println("Stack is empty");
			return null;
		}
		if (firstNum.getNextNum() == null) {
			popped = firstNum;
			firstNum = null;
		} else {
			current = firstNum;
			while (current.getNextNum().getNextNum() != null) {
				current = current.getNextNum();
			}
			popped = current.getNextNum();
			current.setNextNum(null);
		}
		System.out.println("Popping... it's a " + popped.getIntValue());
		return popped;
	}
	
	//returns true if stack is empty
	private boolean empty() {
		if (firstNum == null) {
			return true;
		}
		return false;
	}
	
}