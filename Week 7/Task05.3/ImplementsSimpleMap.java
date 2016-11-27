public class ImplementsSimpleMap implements SimpleMap {
	
	private Node first = null;
	private Node current = null;
	
	public String put(int key, String name) {
		//same key can be used by more than one Node
		
		//create new node
		Node newNode = new Node(key, name);
		
		//check if map empty.  if it is than add as first node
		if (isEmpty()) {
			first = newNode;
		} else {
			//if not empty then add to end of map
			current = first;
			while (current.getNextNode() != null) {
				current = current.getNextNode();
			}
			current.setNextNode(newNode);
		}
		
		return "";
	}
	
	public String[] get(int key) {
		
		//check if list is empty
		if (isEmpty()) {
			return null;
		} 
		String[] result = new String[10]; //array to hold values of matching key
		current = first;
		if (current.getNextNode() == null) {
			if (current.getKey() == key) {
				result[0] = current.getValue();
			}
		} else {
			current = first;
			int i = 0; //counter so value can be added to empty slot in array
			while (current.getNextNode() != null) {
				if (current.getNextNode().getKey() == key) {
					result[i] = current.getNextNode().getValue();
					i++;
				}
				current = current.getNextNode();
			}
		}
		return result;
	}
	
	public void remove(int key, String name) {
		//check if list is empty
		if (isEmpty()) {
			return;
		}
		//check if key, value exists.  If it does then remove it
		current = first;
		while (current.getNextNode() != null) {
			if (current.getNextNode().getKey() == key) {
				if (current.getNextNode().getValue() == name) {
					current.setNextNode(current.getNextNode().getNextNode());
				}
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