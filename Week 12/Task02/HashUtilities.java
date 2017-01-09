public class HashUtilities {

	public static int shortHash(int myInt) {
		int newInt = Math.abs(myInt % 1000); 
		return newInt;
	}

}