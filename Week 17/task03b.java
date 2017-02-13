import java.io.*;

public class task03b {

  public static void main(String[] args) {
    for (String arg : args) {
	  File file = new File(arg);
	  System.out.println("----------------------------------------------");
	  System.out.println(file.getName());
	  System.out.println("");
	  try (BufferedReader in = new BufferedReader(new FileReader(file))) {
		String line;
		while ((line = in.readLine()) != null) {
		  System.out.println(line);
		}
		System.out.println("");
	  } catch (FileNotFoundException ex) {
	    System.out.println("File does not exist");
	  } catch (IOException ex) {
	    ex.printStackTrace();
	  } 
	}
  }

}