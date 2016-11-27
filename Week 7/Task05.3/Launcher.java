public class Launcher {
	
	public static void main(String[] args) {
		Launcher script = new Launcher();
		script.launch();
	}
	
	private void launch() {
		SimpleMap myMap = new ImplementsSimpleMap();
		performMap(myMap);
	}
	
	private void performMap() {
		//map code here
	}
	
}