public class StringPlus extends String {
	
	public void printEven() {
		for (int i = 0; i < this.length(); i++) {
			if (i % 2 == 0) {
				char letter = this.charAt(i);
				System.out.println(letter);
			}
		}
	}
	
}

//this gives a compile error "cannot inherit from final String"
//therefore the point is that you cannot extend a class that is final