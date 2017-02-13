import java.io.*;

public class task04a {

  public static void main(String[] args) {
    File dir = new File(args[args.length-1])
	if (dir.isDirectory()) {
	  dir.mkdir();
	  for (String arg : args) {
	    File file = new File(arg);
		try (BufferedReader in = new BufferedReader(new FileReader(source))) {
	      //code for moving file to directory
	    } catch (FileNotFoundException ex) {
	      ex.printStackTrace();
	    } catch (IOException ex) {
	      ex.printStackTrace();
	    }
	  }
	} else {
	  System.out.println("Last argument is not a directory");
	}
  }

}