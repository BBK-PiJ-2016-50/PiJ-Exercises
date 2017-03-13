import java.util.*;

public class task05b {
  
  public static void main(String[] args) {
    task05b script = new task05b();
    script.launch();
  }
  
  private void launch() {
   
    List<String> words = Arrays.asList("hi", "hello", "hola", "bonjour", "guten tag");
    words.stream().forEach(task05b::printer);
    
  }
  
  private static void printer(String s) {
    System.out.println(s);
  }
  
}