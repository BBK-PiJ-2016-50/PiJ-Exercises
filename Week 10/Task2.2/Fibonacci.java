public class Fibonacci {
	
	public static void main(String[] args) {
		Fibonacci launch = new Fibonacci();
		System.out.println(launch.fibRec(45));
		System.out.println(launch.fibIter(40));
	}

	private int fibRec(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			int result = fibRec(n-1) + fibRec(n-2);
			return result;
		}
	}
	
	private int fibIter(int n) {
		// add code
	}


}