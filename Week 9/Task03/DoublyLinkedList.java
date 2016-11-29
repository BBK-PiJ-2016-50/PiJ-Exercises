public class DoublyLinkedList<T> {
	
	private ListItem<T> first = null;
	private ListItem<T> current = null;
	
	public void addToList(ListItem<T> item) {
		if (first == null) {
			first = item;
			return;
		}
		current = first;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(item);
		item.setPrev(current);
	}
	
	public boolean deleteItem(T value) {		
		if (first == null) {
			System.out.println("No items to delete");
			return false;
		}
		
		if (first.getValue().equals(value)) {
			if (first.getNext() == null) {
				first = null;
			} else {
				first = first.getNext();
				first.setPrev(null);
			} 
			return true;
		}
		
		current = first;
		
		while (current.getNext() != null) {
			if (current.getNext().getValue().equals(value)){
				current.setNext(current.getNext().getNext());
				if (current.getNext() != null) {
					current.getNext().setPrev(current);
				}
				return true;
			}
			current = current.getNext();
		}
		return false;
	}
	
	public void printListForwards() {
		if (first == null) {
			System.out.println("No items to print!");
			return;
		}
		
		current = first;
		
		do {
			System.out.println (current.getValue());
			current = current.getNext();
		} while (current != null); 
	}
	
	public void printListBackwards() {
		if (first == null) {
			System.out.println("No items to print!");
			return;
		}
		
		current = first;
		
		while (current.getNext() != null) {
			current = current.getNext();
		}
		
		do {
			System.out.println (current.getValue());
			current = current.getPrev();
		} while (current != null);
		
	}
	
	public int listLength(){
		int counter = 0;
		if (first == null) {
			return counter;
		} 
		current = first;
		do {
			counter++;
			current = current.getNext();
		} while (current != null);
		return counter;

	}

	
}