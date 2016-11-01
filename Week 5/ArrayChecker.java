public class ArrayChecker {
	
	public boolean isSymmetrical(int[] x) {
		//returns true if array of integers is symmetrical, false otherwise
		//x is the array of ints
		int arrayLength = x.length;
		for (int i = 0; i < arrayLength / 2; i++) {
			if (x[i] != x[arrayLength - 1 - i]) {
				return false;
			}
		}
		return true;
	}
	
	public int[] reverse(int[] x) {
		//returns another array of integers but reversed
		//x is the array of ints
		int arrayLength = x.length;
		int[] reversedArray = new int[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			reversedArray[arrayLength - 1 - i] = x[i];
		}
		return reversedArray;
	}
	
}