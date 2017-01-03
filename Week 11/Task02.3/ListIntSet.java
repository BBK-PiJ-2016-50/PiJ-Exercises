public class ListIntSet implements IntSet {
	
	private Node head = null;
	private Node current = null;
	
	public void add(int value) {
		if (!contains(value)) {
			Node newNode = new Node(value);
			if (head == null) {
				head = newNode;
			} else {
				current = head;
				while (current.getNext() != null) {
					current = current.getNext();
				}
				current.setNext(newNode);
			}
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
	
	public boolean containsVerbose(int num) {
		if (head == null) {
			return false;
		}
		current = head;
		while (current != null) {
			System.out.println(current.getValue());
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