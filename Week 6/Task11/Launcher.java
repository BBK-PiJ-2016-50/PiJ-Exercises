public class Launcher {
	
	public static void main(String[] args) {
		int[] intArray = {2, 3, 14, 10, 578};
		LinkedList newList = ArrayUtilities.array2list(intArray);
		//newList.printList();
		ListUtilities.bubbleSort(newList);
		newList.printList();
	}
	
}