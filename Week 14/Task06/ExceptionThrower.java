public class ExceptionThrower {
	
	public static void main(String[] args) {
		ExceptionThrower exThrower = new ExceptionThrower();
		exThrower.launch();
	}
	
	private void launch() {
		//take input from user - 0-5, 6-10, 11-15, 16-20
		//MyCheckedException - inside try block (I am a checked exception and i have been thrown inside a try block)
		//MyCheckedException - outside try block, throws (I am a checked exception and i have been thrown outside a try block)
		//MyRuntimeException - inside try block (I am a runtime exception and i have been thrown inside a try block)
		//MyRuntimeException - outside try block, throws (I am a runtime exception and i have been thrown outside a try block)
	}
	
}