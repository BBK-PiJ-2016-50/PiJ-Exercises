import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class task03b {
  
  public static void main(String[] args) {
    task03b script = new task03b();
    script.launch();
  }
  
  private void launch() {
   
    List<Integer> nums1 = Arrays.asList(1, 2, 3);
    List<Integer> nums2 = Arrays.asList(3, 4);
    List<int[]> combined = nums1.stream().flatMap(n -> nums2.stream().map(i -> new int[] {n, i})).collect(Collectors.toList());
    combined.forEach((pair) -> System.out.println(pair[0] + " : " + pair[1]));
  }
  
}