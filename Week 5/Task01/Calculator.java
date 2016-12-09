public class Calculator {
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public int subtract(int x, int y) {
		return x - y;
	}
	
	public int multiply(int x, int y) {	
		return x * y;
	}
	
	public double divide(int x, int y) {
		double i = (double) x;
		double j = (double) y;
		return i / j;
	}
	
	public int modulus(int x, int y) {
		return x % y;
	}
	
}