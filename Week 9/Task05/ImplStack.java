public class ImplStack<T extends Number> implements Stack<T> {
	
	private ListItem<T> first = null;
	
	public void push(T item) {
		
		ListItem<T> newItem = new ListItem<T>(item);
		
		if (first == null) {
			first = newItem;
		} else {
			newItem.setNext(first);
			first = newItem;
		}
	}
	
	public T pop() {
		if (first != null) {
			T current = first.getValue();
			first = first.getNext();
			return current;
		}
		return null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
}