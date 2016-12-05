public class Launcher {
	
	public static void main(String[] args) {
		Launcher launch = new Launcher();
		launch.buggyMethod(3);
	}

	String buggyMethod(int n) {
		if (n <= 0) {
			return "";
		}
		return n + " " + buggyMethod(n - 2);
	}


}

//if you feed it a negative number or an odd number then you get a StackOverflowError
//fixed by changing == to <= for the base condition