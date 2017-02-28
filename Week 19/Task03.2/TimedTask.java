import java.util.concurrent.Executor;

public class TimedTask implements Runnable {
  
  private int duration;
  
  public TimedTask(int duration) {
    if (duration > 1000) {
      this.duration = 1000;
    } else {
        this.duration = duration;
    }
  }
  
  public static void main(String[] args) {
    ExecutorImplExt e = new ExecutorImplExt(new Task());
    for (int i = 0; i < 5; i++) {
      Runnable r = new TimedTask(i * 20);
      System.out.println("Max time: " + e.getMaxPendingTime());
      e.execute(r);
      System.out.println("Max time: " + e.getMaxPendingTime());
    }
  }
  
  @Override
  public void run() {
    try {
	    Thread.sleep(duration);
	  } catch (InterruptedException ex) {
	    ex.printStackTrace();
	  }
  }
  
}