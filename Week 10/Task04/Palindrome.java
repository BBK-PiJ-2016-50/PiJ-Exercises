public class Palindrome {
	
	public static void main(String[] args) {
		Palindrome myPal = new Palindrome();
		myPal.run();
	}
	
	private boolean palCheck(String palindrome) {
		int palLen = palindrome.length();
		if (palLen <= 1) {
			return true;
		}
		char first = palindrome.charAt(0);
		char last = palindrome.charAt(palLen - 1);
		if (first == last) {
			palCheck(palindrome.substring(1, palLen - 1));
		} else {
			return false;
		}
		return true;
	}
	
	private void run() {
		String[] pals = {"abba", "sdfjhsdv", "javaj"};
		int length = pals.length - 1;
		for (int i = 0; i <= length; i++) {
			if (palCheck(pals[i])) {
				System.out.println(pals[i] + " is a palindrome");
			} else {
				System.out.println(pals[i] + " is not a palindrome");
			}
		}
	}
	
}