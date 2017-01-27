public class Launcher {
	
	public static void main(String[] args) {
		Launcher script = new Launcher();
		script.launch();
	}
	
	private void launch() {
		ClassC cc = new ClassC();
		ClassA aa = (ClassA) cc;
		aa.throwEx();
	}
	
}