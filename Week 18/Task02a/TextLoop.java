public class TextLoop implements Runnable {

  public static final int COUNT = 10;

  private final String name;

  public TextLoop(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    for (int i = 0; i < COUNT; i++) {
      sleep();
    }
  }
  
  private void sleep() {
    try {
	  Thread.sleep(1000);
	} catch (InterruptedException ex) {
	  ex.printStackTrace();
	}
  }
  
  public static void main(String args[]) {
    if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
      System.out.println("USAGE:  java TextLoop <mode>");
      System.out.println(" mode 0: without threads");
      System.out.println(" mode 1: with threads");
    } else if (args[0].equals("0")) {
      System.out.println("Mode 0 --- without threads");
      for (int i = 0; i < COUNT; i++) {
        Runnable r = new TextLoop("Thread " + i + ".");
        r.run();
      }
    } else {
      System.out.println("Mode 1 --- with threads");
      for (int i = 0; i < COUNT; i++) {
        Runnable r = new TextLoop("Thread " + i + ".");
        Thread t = new Thread(r);
        t.start();
      }
    }
  }
  
}