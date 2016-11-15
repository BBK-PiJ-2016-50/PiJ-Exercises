public class Launcher {
	
	public static void main(String[] args) {
		Launcher script = new Launcher();
		script.launch();
    }

	public void launch() {
		Stack myStack = new Stack();
		testStack(myStack);
	}
		
	private void testStack(Stack stack) {
				
		stack.push(5);
		stack.push(8);
		stack.push(12);
		stack.pop();
		stack.push(13);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
	}	
}