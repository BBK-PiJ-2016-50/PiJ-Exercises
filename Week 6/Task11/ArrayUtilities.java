public class ArrayUtilities {
	
	public static LinkedList array2list(int[] intArray) {
		LinkedList list = new LinkedList();
		for (int i = 0; i <= intArray.length - 1; i++) {
			list.addInt(intArray[i]);
		}
		return list;
	}
	
}