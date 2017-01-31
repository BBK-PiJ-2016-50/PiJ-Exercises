import java.util.List;
import java.util.ArrayList;

public class Task03 {

  public static void main(String[] args) {
    Task03 script = new Task03();
	script.hailstone(50);
  }
  
  private List<Integer> memList = new ArrayList<>();
  
  private List<Integer> hailstone(int n) {
    if (n == 1) {
	  return memList;
	}
    if (n % 2 == 0) {
	  memList.add(n);
	  hailstone(n / 2);
	} else {
	  memList.add(n);
	  hailstone((3*n) + 1);
	}
    return memList;
  }

}