public class Queue {
	
	private IntObj firstNum = null;
	private IntObj current = null;

	//insert integer into queue
	public void insert(int num) {
		IntObj newNum = new IntObj(num);
		System.out.println("Inserting request " + newNum.getIntValue() + "...");
		if (firstNum == null) {
			firstNum = newNum;
			return;
		}
		current = newNum;
		current.setNextNum(firstNum);
		firstNum = current;		
	}
	
	//retrieve first integer from queue
	public IntObj retrieve() {
		IntObj retrieved = null;
		if (firstNum == null) {
			return null;
		}
		
		if (firstNum.getNextNum() == null) {
			return null;
		}
		
		current = firstNum;
		while (current.getNextNum().getNextNum() != null) {
			current = current.getNextNum();
		}
		retrieved = current.getNextNum();
		current.setNextNum(null);
		System.out.println("Retrieving request " + retrieved.getIntValue() + "...done");
		return retrieved;
	}
	
	//return the size of the queue
	public int size() {
		int total = 0;
		IntObj current = firstNum;
		while (current != null) {
			current = current.getNextNum();
			total++;
	  }
	  return total;
	}
	
}