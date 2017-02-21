import java.util.List;
import java.util.ArrayList;

public class ResponsiveUi {
  
  private int duration;
  private int taskCounter = 0;
  private List<Integer> completed = new ArrayList<>();

  public static void main(String[] args) {
    ResponsiveUi rui = new ResponsiveUi();
    rui.launch();
  }
  
  private void launch() {
    for (int i = 0; i < 10; i++) {
      tasks();
	    System.out.print("Enter the duration (in ms) for task " + i + ": ");
      String str = System.console().readLine();
      int duration = Integer.parseInt(str);
      Runnable r = new NewThread(i, duration, this);
      Thread t = new Thread(r);
      t.start();
      taskCounter++;
	  }
    tasks();
  }
  
  public synchronized void isFinished(int id) {
    completed.add(id);
    taskCounter--;
    notifyAll();
  }
  
  private synchronized void tasks() {
    if (completed.size() == 0) {
      return;
    }
    System.out.print("Finished tasks: ");
    for (Integer endedTask : completed) {
      System.out.print(endedTask + " ");
    }
    System.out.println();
    completed = new ArrayList<>();
  }

}