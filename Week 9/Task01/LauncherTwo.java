public class LauncherTwo {
	
	public static void main(String[] args) {
		LauncherTwo script = new LauncherTwo();
		script.launch();
	}
	
	private void launch() {
		ComparatorTwo c = new ComparatorTwo();
		System.out.println(c.getMax(3, 5));
		System.out.println(c.getMax(3.5, 3.55));
		System.out.println(c.getMax("3", "6"));
	}
	
}