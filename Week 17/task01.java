import java.io.File;

public class task01 {

  public static void main(String[] args) {
    File[] files = new File("E:/PiJ-Exercises/Week 15").listFiles();
	for (File file : files) {
	  System.out.println(file.getName());
	}
	
  }

}