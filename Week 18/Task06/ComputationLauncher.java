public class ComputationLauncher {
  
  private static final int COUNT = 500000;
  private static final int THREADS = Runtime.getRuntime().availableProcessors();
  private Computation[] comp = new Computation[THREADS];
  
  public static void main(String[] args) {
    ComputationLauncher cl = new ComputationLauncher();
    cl.launch();
  }
  
  private double[] createArray(int size) {
    double[] result = new double[size];
    for (int i = 0; i < result.length; i++) {
      result[i] = Math.random();
    }
    return result;
  }
  
  private void launch() {
    System.out.println("Number of threads: " + THREADS);
    long start, stop;
    for (int i = 0; i < comp.length; i++) {
      comp[i] = new Computation(createArray(COUNT/THREADS));
    }
    
    start = System.currentTimeMillis();
    sequentialComputations(comp);
    stop = System.currentTimeMillis();
    System.out.println("Time with Threads: " + (stop - start) + " ms");
    
    start = System.currentTimeMillis();
    parallelComputations(comp);
    stop = System.currentTimeMillis();
    System.out.println("Time with Threads: " + (stop - start) + " ms");
    
  }
  
  private void sequentialComputations(Computation[] comp) {
    double result = 0;
    for (Computation c : comp) {
      c.run();
      result += c.getResult();
    }
    System.out.println("Result: " + result);
  }
  
  private void parallelComputations(Computation[] comp) {
    for (Computation c : comp) {
      new Thread(c).start();
    }
    
    double result = 0;
    for (Computation c : comp) {
      result += c.getResult();
    }
    System.out.println("Result: " + result);
  }
  
}