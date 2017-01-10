public class Launcher {
	
	public static void main(String[] args) {
		Launcher script = new Launcher();
		script.launch();
	}
	
	private void launch() {
		Stack<Integer> numStack = new ImplStack<>();
		numStack.push(1);
		numStack.push(2);
		numStack.push(3);
		numStack.push(4);
		numStack.push(5);
		while (!numStack.isEmpty()){
			System.out.println(numStack.pop());
		}
		
		Stack<Double> doubleStack = new ImplStack<>();
		doubleStack.push(1.0);
		doubleStack.push(2.0);
		doubleStack.push(3.0);
		doubleStack.push(4.0);
		doubleStack.push(5.0);
		while (!doubleStack.isEmpty()){
			System.out.println(doubleStack.pop());
		}
		
/*
		Stack<String> stringStack = new ImplStack<>();
		stringStack.push("1.0");
		stringStack.push("2.0");
		stringStack.push("3.0");
		stringStack.push("4.0");
		stringStack.push("5.0");
		while (!stringStack.isEmpty()){
			System.out.println(stringStack.pop());
		}
*/
//commented out code was to prove that generic type was restricted to Numbers
		
	}
	
}