import java.util.*;
import java.util.stream.Collectors;

public class task08a {
  
  public static void main(String[] args) {
    task08a script = new task08a();
    script.launch();
  }
  
  private void launch() {
   
    List<String> words = Arrays.asList("hi", "hello", "hola", "bonjour", "guten tag");
    
    String result = words.stream().reduce("", (s1, s2) -> s1.toUpperCase() + s2.toUpperCase());
    System.out.println(result);    
    
  }
  
}