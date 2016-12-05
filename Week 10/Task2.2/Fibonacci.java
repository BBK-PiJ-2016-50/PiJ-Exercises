public class Fibonacci {
	
	public static void main(String[] args) {
		Fibonacci launch = new Fibonacci();
		System.out.println(launch.fibRec(40));
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
		int result = 0;
		int count = 1;
		int prev = 0;
		int next = 1;
		while (count < n) {
			System.out.println(result);
			result = prev + next;
			prev = next;
			next = result;
			count++;
		}
		return result;
	}


}