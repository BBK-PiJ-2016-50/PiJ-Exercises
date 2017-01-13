public class ImplementSimpleMap implements SimpleMap {
	
	private Node first = null;
	private Node current = null;
	
	public void put(int key, String name) {
		//check if key already used
		if (get(key) != null) {
			System.out.println("key already used");
			return;
		}
		
		//if not then create Node object
		Node newNode = new Node(key, name);
		
		//if not then check if first is null
		if (first == null) {
			first = newNode;
		//else iterate through until last item and link new node
		} else {
			current = first;
			while (current.getNextNode() != null) {
				current = current.getNextNode();
			}
			current.setNextNode(newNode);
		}
	}
	
	public String get(int key) {
		//check if list is empty
		if (isEmpty()) {
			return null;
		}
		//iterate through linked list until key found and return value
		current = first;
		while (current != null) {
			if (current.getKey() == key) {
				return current.getValue();
			}
			current = current.getNextNode();
		}
		//if not found return null
		return null;
	}
	
	public void remove(int key) {
		//check if list is empty
		if (isEmpty()) {
			return;
		}
		//check if only one item in the list
		if (first.getKey() == key) {
			first = null;
			return;
		}
		
		//iterate through linked list until key found and sets to null
		current = first;
		while (current.getNextNode() != null) {
			if (current.getNextNode().getKey() == key) {
				current.setNextNode(current.getNextNode().getNextNode());
			}
			current = current.getNextNode();
		}
		//if not found return null
		return;
	}
	
	public boolean isEmpty() {
		if (first == null) {
			return true;
		}
		return false;
	}
	
}