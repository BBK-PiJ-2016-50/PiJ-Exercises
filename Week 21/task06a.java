import java.util.*;
import java.util.stream.Collectors;

public class task06a {
  
  public static void main(String[] args) {
    task06a script = new task06a();
    script.launch();
  }
  
  private void launch() {
   
    List<String> words = Arrays.asList("hi", "hello", "hola", "bonjour", "guten tag");
    
    List<String> excitingWords = words.stream().map(s -> s + "!").collect(Collectors.toList());
    System.out.println(excitingWords);
    
    List<String> eyeWords = words.stream().map(s -> s.replace("i", "eye")).collect(Collectors.toList());
    System.out.println(eyeWords);
    
    List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
    System.out.println(upperCaseWords);
    
  }
  
}