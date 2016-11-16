public class Launcher {
	
	public static void main(String[] args) {
		int[] intArray = {10, 2, 3, 14, 578};
		LinkedList newList = ArrayUtilities.array2list(intArray);
		newList.printList();
	}
	
}