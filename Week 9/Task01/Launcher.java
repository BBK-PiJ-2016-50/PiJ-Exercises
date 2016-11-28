public class Launcher {
	
	public static void main(String[] args) {
		Launcher script = new Launcher();
		script.launch();
	}
	
	private void launch() {
		Comparator com = new Comparator();
		System.out.println(com.getMax(3, 4));
		System.out.println(com.getMax(3.5, 5.5));
		System.out.println(com.getMax("3", "5"));

	}
	
}