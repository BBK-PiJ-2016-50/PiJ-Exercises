public class Factorial {
	
	public static void main(String[] args) {
		Factorial launch = new Factorial();
		launch.factorialIter(3);
	}

	private int factorialRec(int n) {
		if (n == 1) {
			return 1;
		} else {
			int result = n * factorialRec(n-1);
			return result;
		}
	}
	
	private void factorialIter(int n) {
		int result = 1;
		while (n > 1) {
			result *= n;
			n--;
		}
		return result;
		
	}


}
