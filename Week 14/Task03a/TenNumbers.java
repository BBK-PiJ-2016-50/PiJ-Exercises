public class TenNumbers {

  public static void main(String[] args) {
    TenNumbers tn = new TenNumbers();
	tn.launch();
  }
  
  private void launch() {
    int counter = 0;
	int total = 0;
	while(counter < 10) {
	  try {
	    String input = System.console().readLine();
	    int num = Integer.parseInt(input);
		counter++;
		total += num;
	  } catch (NumberFormatException ex) {
	    System.out.println("Not a number.  Try again...");
	  }
	}
	int mean = total / counter;
	System.out.println("The mean of the 10 numbers is " + mean);
  }

}