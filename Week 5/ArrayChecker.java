public class ArrayChecker {
	
	public boolean isSymmetrical(int[] x) {
		//returns true if array of int is symmetrical, false otherwise
		int firstIndex = 0;
		int lastIndex = 1;
		boolean symmetrical = false;
		double halfx = (x.length) / 2;
		System.out.println(halfx);
		while (firstIndex < halfx) {
			if (x[firstIndex] == x[x.length-lastIndex]) {
				System.out.println(x[firstIndex]);
				System.out.println(x[x.length-lastIndex]);
				firstIndex++;
				lastIndex--;
				symmetrical = true;	
			} else {
				symmetrical = false;
			}
		}
		return symmetrical;
	}
	
	//public int[] reverse(int[] x) {
		//returns another array of int but reversed
	//}
	
}