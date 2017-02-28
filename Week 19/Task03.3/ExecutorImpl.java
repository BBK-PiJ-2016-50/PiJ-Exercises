import java.util.concurrent.Executor;

public class ExecutorImpl implements Executor {

  @Override
  public void execute(Runnable task) {
    new Thread(task).start();
  }  
  
}
