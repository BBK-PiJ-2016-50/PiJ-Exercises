import java.util.*;
import java.util.stream.Collectors;

public class task06b {
  
  public static void main(String[] args) {
    task06b script = new task06b();
    script.launch();
  }
  
  private void launch() {
   
    List<String> words = Arrays.asList("hi", "hello", "hola", "bonjour", "guten tag");
    
    List<String> shortWords = words.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
    System.out.println(shortWords);
    
    List<String> wordsWithB = words.stream().filter(s -> s.contains("b")).collect(Collectors.toList());
    System.out.println(wordsWithB);
    
    List<String> evenLengthWords = words.stream().filter(s -> (s.length() % 2) == 0).collect(Collectors.toList());
    System.out.println(evenLengthWords);
    
    
  }
  
}