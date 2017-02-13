import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.Reader;

public class task03a {

  public static void main(String[] args) {
	  File file = new File(args[0]);
	  try (BufferedReader in = new BufferedReader(new FileReader(file))) {
		String line;
		while ((line = in.readLine()) != null) {
		  System.out.println(line);
		}
	  } catch (FileNotFoundException ex) {
	    System.out.println("File does not exist");
	  } catch (IOException ex) {
	    ex.printStackTrace();
	  } 
	}

}