import java.io.*;

public class task08 {

  public static void main(String[] args) {
    task08 script = new task08();
	script.launch(args);
  }
  
  private void launch(String[] args) {
	String csvFile = args[0];
	try (BufferedReader in = new BufferedReader(new FileReader(csvFile))) {
	  String line;
	  int lineNum = 1;
      while ((line = in.readLine()) != null) {
		String[] nums = line.split(",");
		float total = 0;
		float quant = 0;
		for (String num : nums) {
		  int value = Integer.parseInt(num);
		  total += value;
		  quant++;
		}
		System.out.println("Line " + lineNum + " average: " + (total / quant));
		lineNum++;
	  }
	} catch (FileNotFoundException ex) {
	  System.out.println("File does not exist");
	} catch (IOException ex) {
	  ex.printStackTrace();
	} 
  }
  
}