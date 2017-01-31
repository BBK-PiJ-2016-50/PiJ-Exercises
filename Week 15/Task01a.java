public class Task01a {

  public static void main(String[] args) {
    Task01a script = new Task01a();
	System.out.println(script.doggyMethod(3));
  }


  private String doggyMethod(int n) {
    if (n <= 0) {
      return "";
    }
    String result = doggyMethod(n-3) + n + doggyMethod(n-2);
    return result;
  }

}

//the method was fixed by moving the if statement evaluating the base case to before the recursion