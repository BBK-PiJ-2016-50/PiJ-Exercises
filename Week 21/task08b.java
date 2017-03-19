import java.util.*;
import java.util.stream.Collectors;

public class task08b {
  
  public static void main(String[] args) {
    task08b script = new task08b();
    script.launch();
  }
  
  private void launch() {
   
    List<String> words = Arrays.asList("hi", "hello", "hola", "bonjour", "guten tag");
    
    String result = words.stream().map(s -> s.toUpperCase()).reduce("", (s1, s2) -> s1 + s2);
    System.out.println(result);    
    
  }
  
}