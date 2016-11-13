public class ArrayUtilities {
	
	public static intObj array2list(int[] intArray) {
		
		intObj currentInt = null;
		intObj prevInt = null;
		
		for (int i = 0; i <= intArray.length - 1; i++) {
			currentInt = new intObj(intArray[i]);
			if (prevInt == null) {
				prevInt = currentInt;
			} else {
				prevInt.nextInt = currentInt;
				prevInt = currentInt;
			}
		}
		return currentInt;	
	}
		
}