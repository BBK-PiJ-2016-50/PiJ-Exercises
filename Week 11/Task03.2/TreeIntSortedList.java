public class TreeIntSortedList implements IntSortedList {
	
	private int value;
	private TreeIntSortedList left;
	private TreeIntSortedList right;
	
	public TreeIntSortedList(int value) {
		this.value = value;
	}
	
	public void add(int newValue) {
		if (newValue > this.value) {
			if (right == null) {
				right = new TreeIntSortedList(newValue);
			} else {
				right.add(newValue);
			}
		} else {
			if (left == null) {
				left = new TreeIntSortedList(newValue);
			} else {
				left.add(newValue);
			}
		}
	}
	
	public boolean contains(int num) {
		if (this.value == num) {
			return true;
		} else if (num > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(num);
			}
		} else {
			if (left == null) {
				return false;
			} else {
			 return left.contains(num);
			}
		}
	}
	
	public String toString() {
		String result = "";
		result += this.value + ", ";
		if (left != null) {
			result += left.toString();
		}
		if (right != null) {
			result += right.toString();
		}
		return result;
	}
	
}