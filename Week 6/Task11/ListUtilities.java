public class ListUtilities {
	
	public static void bubbleSort(LinkedList list) {
		
		IntObj first = null;
		IntObj current = null;
		IntObj next = null;
		IntObj prev = null;
		
		
		//set first item
		if (list.getFirstItem() == null) {
			return;
		} else {
			first = list.getFirstItem();
		}
		
		current = first;
		next = current.getNextNum();
		boolean swapMade = true;
		while (swapMade) {
			swapMade = false;
			while (next != null) {				
				//check if current value is greater than next value
				if (current.getIntValue() > next.getIntValue()) {
					swapMade = true;
					//if it is then check if prev is null.  Will occur for first item
					if (prev != null) {
						IntObj temp = next.getNextNum();
						prev.setNextNum(next);
						next.setNextNum(current);
						current.setNextNum(temp);
					} else {
						IntObj temp = next.getNextNum();
						first = next;
						next.setNextNum(current);
						current.setNextNum(temp);
					}
					prev = next;
					next = current.getNextNum();
				} else {
					//if value is not greater then move to next num by updating variables
					prev = current;
					current = next;
					next = next.getNextNum();
				}
			
			}
		}
	}
	
}