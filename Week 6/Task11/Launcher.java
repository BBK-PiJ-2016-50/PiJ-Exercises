public class Launcher {
	
	public static void main(String[] args) {
		int[] intArray = {2, 5, 3};
		LinkedList newList = ArrayUtilities.array2list(intArray);
		//newList.printList();
		ListUtilities.bubbleSort(newList);
		newList.printList();
		//ListUtilities.bubbleSort(newList);
		//newList.printList();
	}
	
}