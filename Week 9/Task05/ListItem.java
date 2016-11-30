public class ListItem<T> {
	
	private T value = null;
	private ListItem<T> next = null;
	
	public ListItem(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return this.value;
	}
	
	public ListItem<T> getNext() {
		return next;
	}
	
	public void setNext(ListItem<T> item) {
		this.next = item;
	}
	
}