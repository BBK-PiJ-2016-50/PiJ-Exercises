public class User implements Runnable {
  
  private ExecutorImpl taskExec;
  private int userId;
  private int threshold;
  private int MAX_WAIT = 10000;
  private ResponsiveUi ui;
  
  public User(ExecutorImpl taskExec, int userId, int threshold, ResponsiveUi ui) {
    this.taskExec = taskExec;
    this.userId = userId;
    this.threshold = threshold;
    this.ui = ui;
  }
  
  @Override
  public void run() {
    
    while(ui.getMaxWait() > threshold) {
      
      System.out.println("The site is down");
    
      Task task = new Task(userId, threshold, ui);
      taskExec.execute(task);
      
      try {
        Thread.sleep(MAX_WAIT);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }
  }
  
}