import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class IntegerList implements Runnable {
  
  private List<Integer> intList = new ArrayList<>();
  private boolean sorted = false;
  
  @Override
  public synchronized void run() {
    while (!sorted) {
      while (sorted) {
        System.out.println("|");
        try {
          wait();
        } catch (InterruptedException ex) {
          //nothing here
        }
      }
      System.out.print(".");
      boolean inOrder = sorting();
      if (inOrder) {
        setSorted(true);
      }
      try {
        Thread.sleep(500);
      } catch (InterruptedException ex) {
        //nothing here
      }
    }
  }
  
  public synchronized void setSorted(boolean value) {
    sorted = value;
    notifyAll();
  }
  
  public synchronized void add(Integer value) {
    intList.add(value);
    setSorted(false);
  }
  
  public synchronized int get(int value) {
    while (!sorted) {
      try {
        wait();
      } catch (InterruptedException ex) {
        //nothing here
      }
    }
    return intList.get(value);
    
  }
  
  private synchronized boolean sorting() {
    Collections.sort(intList);
    return true;
  }
}