import java.time.Duration;
import java.time.Instant;

public class Task02 {

  public static void main(String[] args) {
    Task02 script = new Task02();
	script.launch();
  }
  
  private int[] precalculated = null;
  
  public void launch() {
	
	Instant start = Instant.now();
	System.out.println("fib: " + fib(40));
	Instant end = Instant.now();
	System.out.println("Timing: " + Duration.between(start, end).toMillis());
	
	start = Instant.now();
	System.out.println("fib with mem: " + memFib(40));
	end = Instant.now();
	System.out.println("Timing: " + Duration.between(start, end).toMillis());
	
	start = Instant.now();
	System.out.println("fib: " + fib(45));
	end = Instant.now();
	System.out.println("Timing: " + Duration.between(start, end).toMillis());
	
	precalculated = null;
	start = Instant.now();
	System.out.println("fib with mem: " + memFib(45));
	end = Instant.now();
	System.out.println("Timing: " + Duration.between(start, end).toMillis());
  }
  
  public static int fib(int n) {
    if ((n == 1) || (n == 2)) {
	  return 1;
	} else {
	  int result = fib(n-1) + fib(n-2);
	  return result;
	}
  }
  
  public int memFib(int n) {
    if (precalculated == null) {
	  precalculated = new int[n];
	  for (int i = 0; i < precalculated.length; i++) {
	    precalculated[i] = -1;
	  }
	}
    if ((n == 1) || (n == 2)) {
	  return 1;
	} else {
	  if (precalculated[n-1] != -1) {
	    return precalculated[n-1];
	  } else {
	    int result = fib(n-1) + fib(n-2);
		precalculated[n-1] = result;
	    return result;
	  }
	}
  }

}