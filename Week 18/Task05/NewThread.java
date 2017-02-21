public class NewThread implements Runnable {
  
  private int id;
  private int duration;
  private ResponsiveUi ui;
  
  public NewThread(int id, int duration, ResponsiveUi ui) {
    this.id = id;
    this.duration = duration;
    this.ui = ui;
  }
  
  @Override
  public void run() {
    try {
	    Thread.sleep(duration);
	  } catch (InterruptedException ex) {
	    ex.printStackTrace();
	  }
    ui.isFinished(this.id);
  }
  
}