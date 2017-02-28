public class Task implements Runnable {
  
  private int id;
  private int duration;
  private ResponsiveUi ui;
  
  public Task(int id, int duration, ResponsiveUi ui) {
    this.id = id;
    this.duration = duration;
    this.ui = ui;
  }
  
  @Override
  public void run() {
    System.out.println("Start  > User " + id + ".");
    try {
	    Thread.sleep(duration);
	  } catch (InterruptedException ex) {
	    ex.printStackTrace();
	  }
    System.out.println("Finish  > User " + id + ".");
    ui.isFinished(id);
  }
  
}