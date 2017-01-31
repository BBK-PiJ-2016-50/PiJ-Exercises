import java.util.List;
import java.util.ArrayList;

public class Task04 {
  
  public static void main(String[] args) {
    Task04 script = new Task04();
    script.launch();
  }
  
  private List<Integer> myList = new ArrayList<>();
  private int comparisons = 0;
  
  private void launch() {
    for (int i = 1; i < 1000; i++) {
      myList.add(i);
    }
    System.out.println("number in list: " + binarySearch(myList, 45794));
    System.out.println("comparisons: " + comparisons);
  }

  private boolean binarySearch(List<Integer> myList, Integer num) {
    comparisons++;
    if (myList.isEmpty()) {
      return false;
    }
    int middle = myList.size() / 2;
    if (myList.size() == 1) {
      return (myList.get(0) == num);
    }
    if (myList.get(middle) == num) {
      return true;
    } else if (num < myList.get(middle)) {
      return binarySearch(myList.subList(0, middle), num);
    } else {
      return binarySearch(myList.subList(middle, myList.size()), num);
    }
  }
  
}