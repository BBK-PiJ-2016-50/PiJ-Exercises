public class Company {
	
	public static void main(String[] args) {
		Company comp = new Company();
		comp.start();
	}
	
	private void start() {
		//create employees list
		DoublyLinkedList<String> employees = new DoublyLinkedList<String>();
		employees.addToList("Dave");
		employees.addToList("Sam Rogers");
		employees.addToList("Kate Phillips");
		employees.addToList("Sarah Jones");
		employees.addToList("Matt Wilson");
		employees.printListForwards();
		
		//creates national insurance number list
		DoublyLinkedList<Integer> niNums = new DoublyLinkedList<>();
		niNums.addToList(4658634);
		niNums.addToList(7656878);
		niNums.addToList(5645645);
		niNums.addToList(5434546);
		niNums.addToList(5464575);
		niNums.printListForwards();
		
	}
	
}