public class Launcher {
	
	public static void main(String[] args) {
		Launcher script = new Launcher();
		script.run();
	}
	
	private void run() {
		int[] nums = {14,5,65,78,2,3000};
		IntegerTreeNode tree = new IntegerTreeNode(nums[0]);
		for (int i = 1; i <= nums.length-1; i++) {
			tree.add(nums[i]);
		}
		System.out.println(tree.contains(1));
		System.out.println(tree.getMax());
		System.out.println(tree.getMin());
	}
	
}