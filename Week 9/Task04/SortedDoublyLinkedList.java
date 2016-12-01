public class SortedDoublyLinkedList<T extends Comparable<T>> extends DoublyLinkedList<T> {

	private ListItem<T>  first = null;
	private ListItem<T>  current= null;

	@Override
	public void addToList(T item) {
		
		ListItem<T> newItem = new ListItem<T>(item);
		
		if (first == null) {
			first = newItem;
			return;
		}
		
		if (newItem.getValue().compareTo(first.getValue()) < 0) {
			newItem.setNext(first);
			first.setPrev(newItem);
			first = newItem;
			return;
		}
		
		current = first;
	
		while (current.getNext() != null && (current.getNext().getValue().compareTo(newItem.getValue()) < 0)) {
			current = current.getNext();
		}
		newItem.setNext(current.getNext());
		current.getNext().setPrev(newItem);
		current.setNext(newItem);
		newItem.setPrev(current);
		
	}

}