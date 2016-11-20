public class ListUtilities {
	
	public static void bubbleSort(LinkedList list) {
		
		IntObj first = null;
		IntObj current = null;
		IntObj next = null;
		
		if (list.getFirstItem() == null) {
			return;
		} else {
			first = list.getFirstItem();
		}
		
		current = first;
		next = current.getNextNum();

		while (current.getNextNum() != null) {
			if (current.getIntValue() <= current.getNextNum().getIntValue()) {
				current = current.getNextNum();
			} else {
				current.getPrevNum().setNextNum(current.getNextNum());
				next.setPrevNum(current.getPrevNum());
				current.getNextNum().getNextNum().setPrevNum(current);				
				current.setNextNum(current.getNextNum().getNextNum());
				current.setPrevNum(next);
				next.setNextNum(current);
			}
			
		}
	}
	
}