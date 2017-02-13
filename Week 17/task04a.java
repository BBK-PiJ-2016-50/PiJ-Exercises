import java.io.*;

public class task04a {

  public static void main(String[] args) {
    File source = new File(args[0]);
	File dest = new File(args[1]);
	try (BufferedReader in = new BufferedReader(new FileReader(source)); 
	     PrintWriter out = new PrintWriter(dest)) {
	  String line;
	  while ((line = in.readLine()) != null) {
		out.println(line);
	  }
	} catch (FileNotFoundException ex) {
	  ex.printStackTrace();
	} catch (IOException ex) {
	  ex.printStackTrace();
	}
  }

}