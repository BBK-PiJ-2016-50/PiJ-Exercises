public class GreatestCommonDivisor {
	
	public static void main(String[] args) {
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		gcd.run(15, 12);
	}
	
	private int findGcd(int p, int q) {
		if (p % q == 0) {
			return q;
		} else {
			return findGcd(q, (p%q));
		}
	}
	
	private void run(int num1, int num2) {
		System.out.print("GCD of " + num1 + " and " + num2 + " is ");
		if (num1 > num2) {
			System.out.println(findGcd(num1, num2));
		} else {
			System.out.println(findGcd(num2, num1));
		}
	}
	
}