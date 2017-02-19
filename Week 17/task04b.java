import java.io.*;

public class task04b {

  public static void main(String[] args) {
    File dir = new File(args[args.length-1]);
	  if (!dir.isDirectory()) {
	    System.out.println("Directory doesn't exist");
    }
	  for (int i = 0; i < args.length - 1; i++) {
	    File source = new File(args[i]);
      File dest = new File(dir + "/" + source.getName());
	    try (BufferedReader in = new BufferedReader(new FileReader(source)); 
           PrintWriter out = new PrintWriter(dest)){
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

}