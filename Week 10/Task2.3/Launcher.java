public class Launcher {
	
	private int counter = 0;
	
	private int calcMoves(int discs) {
		if (discs == 1) { // base condition
			counter++;
			return counter;
		} else {
			calcMoves(discs - 1); // move discs-1 from start to middle
			counter++; // move last disc from start to end
			calcMoves(discs - 1); //move discs-1 from middle to end
			return counter;
		}
	}
	
	public static void main(String[] args) {
		Launcher hanoi = new Launcher();
		System.out.println(hanoi.calcMoves(3));
	}
	
}