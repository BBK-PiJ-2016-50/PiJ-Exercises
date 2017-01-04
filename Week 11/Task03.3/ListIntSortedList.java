public class ListIntSortedList implements IntSortedList {
	
	private Node head = null;
	private Node current = null;
	
	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else if (newNode.getValue() < head.getValue()) {
			newNode.setNext(head);
			head = newNode;
		} else {
			current = head;
			while (current.getNext() != null && current.getNext().getValue() < newNode.getValue()) {
				current = current.getNext();
			}
			newNode.setNext(current.getNext());
			current.setNext(newNode);
		}
	}

	public boolean contains(int num) {
		if (head == null) {
			return false;
		}
		current = head;
		while (current != null) {
			if (current.getValue() == num) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}
	
	public String toString() {
		String result = "";
		if (head == null) {
			return result + "empty set";
		} else {
			current = head;
			do {
				result += current.getValue() + ", ";
				current = current.getNext();
			} while (current != null);
			return result;
		}
	}
	
}