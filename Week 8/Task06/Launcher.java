public class Launcher {
	
	public static void main (String[] args) {
		Launcher launcher = new Launcher();
		launcher.launch();
	}
	
	public void launch() {
		Lecturer lecturer = new Lecturer("Dave");
		System.out.println("Lecturer is " + lecturer.getName());
		lecturer.teach("Biology");
		lecturer.doResearch("Yaks");
	}
	
}