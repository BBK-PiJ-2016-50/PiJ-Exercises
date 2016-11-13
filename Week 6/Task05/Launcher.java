public class Launcher {
	
	public static void main(String[] args) {
		Launcher script = new Launcher();
		script.launch();
    }

	public void launch() {
		Queue myQ = new Queue();
		testQueue(myQ);
	}
		
	private void testQueue(Queue queue) {
		
		System.out.println("There are " + queue.size() + " requests in the queue.");
		queue.insert(5);
		queue.insert(8);
		queue.insert(12);
		System.out.println("There are " + queue.size() + " requests in the queue.");
		queue.retrieve();
		queue.insert(13);
		System.out.println("There are " + queue.size() + " requests in the queue.");
		queue.retrieve();
		queue.retrieve();
		System.out.println("There are " + queue.size() + " requests in the queue.");
		queue.retrieve();
		
	}	
}