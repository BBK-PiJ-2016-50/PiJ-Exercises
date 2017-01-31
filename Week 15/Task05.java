import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Task05 {
  
  public static void main(String[] args) {
    Task05 script = new Task05();
    script.launch();
  }
  
  private List<Integer> myList = new ArrayList<>(Arrays.asList(3, 7, 2, 9, 1));
  private List<Integer> result = new ArrayList<>();
  private List<Integer> left = new ArrayList<>();
  private List<Integer> right = new ArrayList<>();
  private List<Integer> leftSorted;
  private List<Integer> rightSorted;
  
  private void launch() {
    System.out.println(myList.toString());
    System.out.println(mergeSort(myList));
  }
  
  private List<Integer> mergeSort(List<Integer> myList) {
    if (myList.isEmpty() || myList.size() == 1) {
      return myList;
    }
    int middle = myList.size() / 2;
    left = myList.subList(0, middle);
    right = myList.subList(middle, myList.size());
    leftSorted = mergeSort(left);
    rightSorted = mergeSort(right);
    
    while (!leftSorted.isEmpty() || !rightSorted.isEmpty()) {
      
      if (leftSorted.isEmpty()) {
        result.add(rightSorted.get(0));
        rightSorted.remove(0);
      } else if (rightSorted.isEmpty()) {
        result.add(leftSorted.get(0));
        leftSorted.remove(0);
      } else if (leftSorted.get(0) < rightSorted.get(0)) {
        result.add(leftSorted.get(0));
        leftSorted.remove(0);
      } else if (rightSorted.get(0) < leftSorted.get(0)) {
        result.add(rightSorted.get(0));
        rightSorted.remove(0);
      }
    
    }
    return result;
  }

  
}