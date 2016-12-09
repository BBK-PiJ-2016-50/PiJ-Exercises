public class Power {
	
	public static void main(String[] args) {
		Power pow = new Power();
		System.out.println("Recursively calculated: " + pow.powRecursive(2, 8));
		System.out.println("Iteratively calculated: " + pow.powIterative(2, 8));
	}
	
	private int powRecursive(int base, int exp) {
		if (exp == 0) {
			return 1;
		} else {
			return base * powRecursive(base, exp-1);
		}
	}
	
	private int powIterative(int base, int exp) {
		int counter = 0;
		int res = 1;
		while (counter < exp) {
			res *= base;
			counter++;
		}
		return res;
	}
	
}