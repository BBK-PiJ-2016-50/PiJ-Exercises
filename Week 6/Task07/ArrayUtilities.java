public class ArrayUtilities {
	
	public static void array2list(int[] intArray) {
		
		IntObj firstNum = null;
		IntObj current = null;
	
		for (int i = 0; i <= intArray.length - 1; i++) {
			
			IntObj newInt = new IntObj(intArray[i]);
			
			if (firstNum == null) {
				firstNum = newInt;
			} else {
				current = firstNum;
				while (current.getNextNum() != null) {
					current = current.getNextNum();
				}
				current.setNextNum(newInt);
			}
		}
	}		
}