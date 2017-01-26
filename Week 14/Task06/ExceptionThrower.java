public class ExceptionThrower {
	
	public static void main(String[] args) throws MyCheckedException {
		ExceptionThrower exThrower = new ExceptionThrower();
		int input = Integer.parseInt(args[0]);
		exThrower.launch(input);
	}
	
	private void launch(int input) throws MyCheckedException {
		if (input == 1) {
			try {
				int arr[] = {1, 2, 3};
				int num = arr[3];
			} catch (IndexOutOfBoundsException ex) {
				throw new MyCheckedException("I am a checked exception and i have been thrown inside a try block");
			}
		} else if (input == 2) {
			try {
			  int arr[] = {1, 2, 3};
				int num = arr[3];
			} catch (IndexOutOfBoundsException ex) {
				throw new MyRuntimeException("I am a runtime exception and i have been thrown inside a try block");
			}
		} else if (input == 3) {
			throw new MyCheckedException("I am a checked exception and i have been thrown outside a try block");
		} else {
			throw new MyRuntimeException("I am a runtime exception and i have been thrown outside a try block");
		}
	}
	
}