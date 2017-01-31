import java.util.List;
import java.util.ArrayList;

public class Task03 {

  public static void main(String[] args) {
    Task03 script = new Task03();
	  System.out.println(script.hailstone(547324));
  }
  
  private List<Integer> memList = new ArrayList<>();
  private int num;
  
  private List<Integer> hailstone(int n) {
    if (n == 1) {
	    return memList;
	  }
    if (n % 2 == 0) {
      num = n / 2;
	  } else {
	    num = (3 * n) + 1;
	  }
    memList.add(num);
    hailstone(num);
    return memList;
  }

}