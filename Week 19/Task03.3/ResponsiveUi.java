import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.*;

public class ResponsiveUi {
  
  private int THRESHOLD = 1000;
  private int NUM_USERS = 5;
  private int taskCounter = 0;
  private List<Integer> completed = new ArrayList<>();

  public static void main(String[] args) {
    ResponsiveUi rui = new ResponsiveUi();
    rui.launch();
  }
  
  private void launch() {
    ExecutorImpl taskExec = new ExecutorImpl();
    ScheduledExecutorService userExec = Executors.newScheduledThreadPool(5);
    for (int id = 0; id < NUM_USERS; id++) {
      Runnable r = new User(taskExec, id, THRESHOLD, this);
      userExec.execute(r);
      taskCounter++;
	  }
    userExec.shutdown();
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
  
  public int getMaxWait() {
    return taskCounter * THRESHOLD;
  }

}