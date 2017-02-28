import java.util.concurrent.*;

public class ExecutorImplExt extends ExecutorImpl implements Executor {

  public ExecutorImplExt(Executor executor) {
    super(executor);
  }
  
  public int getMaxPendingTime() {
    return tasks.size() * 1000;
  }

}