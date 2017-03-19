import java.util.*;
import java.util.stream.Collectors;

public class task09a {
  
  public static void main(String[] args) {
    task09a script = new task09a();
    script.launch();
  }
  
  private void launch() {
    randomNumberList(5);
  }
  
  private static void randomNumberList(int size) {
    List<Double> nums = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      double r = Math.random();
      nums.add(r * 10);
    }
    
    List<Double> result = nums.stream().collect(Collectors.toList());
    System.out.println(result);
  }
  
}