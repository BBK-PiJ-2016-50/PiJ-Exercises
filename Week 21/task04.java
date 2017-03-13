import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class task04 {
  
  public static void main(String[] args) {
    task04 script = new task04();
    script.launch();
  }
  
  private void launch() {
   
    List<Integer> nums1 = Arrays.asList(1, 2, 3);
    List<Integer> nums2 = Arrays.asList(3, 4);
    List<int[]> combined = nums1.stream()
                          .flatMap(n -> nums2.stream()
                          .filter((j) -> (n + j) % 3 == 0)
                          .map(i -> new int[] {n, i}))
                          .collect(Collectors.toList());
    combined.forEach((pair) -> System.out.println(pair[0] + " : " + pair[1]));
  }
  
}