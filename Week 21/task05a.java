import java.util.*;

public class task05a {
  
  public static void main(String[] args) {
    task05a script = new task05a();
    script.launch();
  }
  
  private void launch() {
   
    List<String> words = Arrays.asList("hi", "hello", "hola", "bonjour", "guten tag");
    words.stream().forEach((word) -> System.out.println("  " + word));
    
  }
  
}