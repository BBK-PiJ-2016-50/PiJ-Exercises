public class Node {
	
	private int key;
	private String value;
	private Node nextNode;
	
	public Node(int key, String value) {
		this.key = key;
		this.value = value;
		this.nextNode = null;
	}
	
	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node newNode) {
		nextNode = newNode;
	}
	
	public int getKey(){
		return key;
	}
	
	public String getValue(){
		return value;
	}
	
}