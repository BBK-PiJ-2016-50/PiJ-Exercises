public class IntegerTreeNode {
	
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	public IntegerTreeNode(int value) {
		this.value = value;
	}
	
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}
	
	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
	}
	
	public int getMax() {
		if (right == null) {
			return this.value;
		} else {
			return right.getMax();
		}
	}
	
	public int getMin() {
		if (left == null) {
			return this.value;
		} else {
			return left.getMin();
		}
	}
	
	
	public String toString() {
		String result = "[";
		result += this.value;
		result += " L";
		if (left != null) {
			result += left.toString();
		} else {
			result += "[]";
		}
		result += " R";
		if (right != null) {
			result += right.toString();
		} else {
			result += "[]";
		}
		return result += "]";
	}
	
	public String toStringSimple() {
		String result = "[";
		result += this.value;
		if (left != null) {
			result += left.toStringSimple();
		}
		if (right != null) {
			result += right.toStringSimple();
		}
		return result += "]";
	}
	
	public int depth() {
		int depthLeft = 0;
		int depthRight = 0;
		if (left != null) {
			depthLeft = 1 + left.depth();
		}
		if (right != null) {
			depthRight = 1 + right.depth();
		}
		if (depthLeft > depthRight) {
			return depthLeft;
		} else {
			return depthRight;
		}
	}
			
	
}