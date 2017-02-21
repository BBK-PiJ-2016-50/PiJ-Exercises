public class ResponsiveUi implements Runnable {
  
  private int duration;
  
  public ResponsiveUi(int duration) {
    this.duration = duration;
  }

  @Override
  public void run(int duration) {
    try {
	  Thread.sleep(duration);
	} catch (InterruptedException ex) {
	  ex.printStackTrace();
	}
  }

  public static void main(String[] args) {
    ResponsiveUi rui = new ResponsiveUi();
  }
  
  
  private void launch() {
    for (int i = 0; i < 10; i++) {
	  System.out.print("Enter the duration (in ms) for task " + i + ": ");
	  int duration = Integer.parseInt(System.console().readLine());
	  Runnable r = new ResponsiveUi();
	  Thread t = new Thread(r);
	  t.start();
	  System.out.println("Finished tasks: " + i);
	}
  }

}