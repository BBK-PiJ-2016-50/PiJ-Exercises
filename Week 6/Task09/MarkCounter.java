public class MarkCounter {
	
	public void countMarks() {
		int total = 0;
		int distinctions = 0;
		int passes = 0;
		int fails = 0;
		int invalid = 0;
		String input;
		do {
			System.out.print("Input a mark: ");
			input = System.console().readLine();
			int mark = Integer.parseInt(input);
			total++;
			if (mark >= 70 && mark <= 100) {
				distinctions++;
			} else if (mark >= 50 && mark <= 69) {
				passes++;
			} else if (mark >= 0 && mark <= 49) {
				fails++;
			} else {
				invalid++;
			}
		} while (!input.equals("-1"));
		invalid--;  //removes the -1 input from the count
		total--;	//removes the -1 input from the count
		System.out.println("There are " + total + " students: " + distinctions + " distinctions, " + 
							passes + " passes, " + fails + " fails (plus " + invalid + " invalid).");
	}
	
}