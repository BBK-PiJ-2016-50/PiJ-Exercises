public class Launcher {
	
	public static void main(String[] args) {
		int[] intArray = {1044, 2, 7823, 3, 14, 4};
		LinkedList newList = ArrayUtilities.array2list(intArray);
		//newList.printList();
		ListUtilities.bubbleSort(newList);
		newList.printList();
		//ListUtilities.bubbleSort(newList);
		//newList.printList();
	}
	
}