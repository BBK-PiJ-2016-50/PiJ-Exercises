public class Launcher {
	
	public static void main(String[] args) {
		Launcher script = new Launcher();
		script.launch();
	}
	
	public void launch() {
		IntSet tree = new TreeIntSet(2);
		tree.add(3);
		tree.add(4);
		tree.add(5);
		tree.add(6);
		tree.add(2);
		tree.add(9);
		tree.add(3);
		
		System.out.println(tree.toString());
		System.out.println(tree.contains(3));
		System.out.println(tree.contains(100));
		
		tree.containsVerbose(9);
		
	}
	
}