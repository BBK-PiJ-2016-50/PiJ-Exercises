import java.util.List;
import java.util.ArrayList;

public class IntegerSort {
  
  public static void main (String[] args) {
    IntegerSort intSort = new IntegerSort();
    intSort.launch();
  }
  
  private void launch() {
    IntegerList intList = new IntegerList();
    intList.add(7);
    intList.add(9);
    intList.add(2);
    intList.add(3);
    intList.add(1);
    intList.add(6);
    Thread newThread = new Thread(intList);
    newThread.start();
    boolean finished = false;
    while (!finished) {
      System.out.print("type number to add and g to get and s to stop: ");
      String input = System.console().readLine();
      if (input.equals("g")) {
        System.out.print("getting 3rd item: ");
        int value = intList.get(3);
        System.out.println("item is: " + value);
      } else {
        if (input.equals("s")) {
          finished = true;
        } else {
          int num = Integer.parseInt(input);
          intList.add(num);
        }
      }
    }
  }
  
}