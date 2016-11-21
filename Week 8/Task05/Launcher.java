public class Launcher {
	
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		launcher.launch();
	}
	
	public void launch() {
		Guitar guitar = new Guitar();
		guitar.play();
		guitar.burn();
	}
	
}