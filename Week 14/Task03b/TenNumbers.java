public class TenNumbers {

  public static void main(String[] args) {
    TenNumbers tn = new TenNumbers();
	  tn.launch();
  }
	
	private int numNums;
	private int num;
  
  private void launch() {
		double counter = 0;
	  double total = 0;
		int numNums = getNum("How many numbers?");
	  while(counter < numNums) {
	    int num = getNum("");
			counter++;
		  total += num;
	  }
		double mean = total / counter;
	  System.out.println("The mean of the " + numNums + " numbers is " + mean);
  }
	
	private int getNum(String question) {
		boolean correct = false;
		while (!correct) {
			try {
		    String input = System.console().readLine(question);
		    int num = Integer.parseInt(input);
				correct = true;
				return num;
			} catch (NumberFormatException ex) {
	      System.out.println("Not a number.  Try again...");
			}
		}
		return num;
	}

}