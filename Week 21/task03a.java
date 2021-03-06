import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class task03a {
  
  public static void main(String[] args) {
    task03a script = new task03a();
    script.launch();
  }
  
  private void launch() {
   
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Stream<Integer> myStream = nums.stream();
    List<Integer> sqrts = myStream.map((i) -> i * i).collect(Collectors.toList());
    System.out.println(sqrts);
  }
  
}