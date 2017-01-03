public class TreeIntSet implements IntSet {
	
	private int value;
	private TreeIntSet left;
	private TreeIntSet right;
	
	public TreeIntSet(int value) {
		this.value = value;
	}
	
	public void add(int newValue) {
		if (contains(newValue)) {
			return;
		}
		if (newValue > this.value) {
			if (right == null) {
				right = new TreeIntSet(newValue);
			} else {
				right.add(newValue);
			}
		} else {
			if (left == null) {
				left = new TreeIntSet(newValue);
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
	
	public boolean containsVerbose(int num) {
		System.out.println(this.value);
		if (num == this.value) {
			return true;
		} else if (num > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.containsVerbose(num);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.containsVerbose(num);
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