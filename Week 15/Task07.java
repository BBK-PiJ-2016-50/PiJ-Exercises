import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Task07 {
  
  public static void main(String[] args) {
    Task07 script = new Task07();
    script.launch();
  }
  
  private List<Integer> myList = new ArrayList<>(Arrays.asList(3, 7, 2, 9, 1));
  private List<Integer> result = new ArrayList<>();
  
  private void launch() {
    System.out.println(myList.toString());
    System.out.println(quickSort(0, myList.size()));
  }
  
  private List<Integer> quickSort(int low, int high) {
    
    if (myList.isEmpty || myList.size() == 1) {
      return myList;
    }
    
    int lowNum = low;
    int highNum = high;
    int pivot = high / 2;
    
    while (lowNum <= highNum) {
      while (myList[lowNum] < pivot) {
        lowNum++;
      }
      while (myList[highNum] > pivot) {
        highNum--;
      } 
    }
    
    if (lowNum <= highNum) {
      int temp = myList[lowNum];
      myList[lowNum] = myList[highNum];
      myList[highNum] = temp;
      lowNum++;
      highNum--;
    }
    
    if (low < highNum) {
      quickSort(low, highNum);
      //result.add(low);
    }
    if (lowNum < high) {
      quickSort(lowNum, high);
      //result.add(high);
    }
    
    return result;
    
  }
  
}