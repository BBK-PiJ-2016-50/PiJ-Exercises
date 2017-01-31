public class Task01b {

  public static void main(String[] args) {
    Task01b script = new Task01b();
	System.out.println(script.mcCarthy91(95));
  }

  private int mcCarthy91(int n) {
    if (n > 100) {
	  System.out.println("num = " + n);
      return n - 10;
    } else {
	  System.out.println("num = " + n);
      return mcCarthy91(mcCarthy91(n+11));
    }
  }

}

//the result of each calculation is 91