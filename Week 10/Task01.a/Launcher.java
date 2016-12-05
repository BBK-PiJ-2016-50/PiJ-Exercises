public class Launcher {
	
	public static void main(String[] args) {
		Launcher launch = new Launcher();
		launch.printNumbers(6);
	}

	void printNumbers(int n) {
		if (n <= 0) {
			return;
		}
		System.out.println("first " + n);
		printNumbers(n-2);
		printNumbers(n-3);
		System.out.println("second " + n);
	}

}