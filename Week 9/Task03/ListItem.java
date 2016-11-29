public class ListItem<T> {
	
	private T value;
	private ListItem<T> next;
	private ListItem<T> prev;
	
	public ListItem(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	public ListItem<T> getNext() {
		return next;
	}
	
	public void setNext(ListItem<T> value) {
		this.next = value;
	}
	
	public ListItem<T> getPrev() {
		return prev;
	}
	
	public void setPrev(ListItem<T> value) {
		this.prev = value;
	}
}