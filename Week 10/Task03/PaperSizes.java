public class PaperSizes {
	
	private int width = 841;
	private int height = 1189;
	
	private void calcSize(String sheet) {
		//extract number from sheet parameter
		String num = sheet.substring(1);
		int size = Integer.parseInt(num);
		//use Din-A0 as basis for measurement
		if (size == 0 && num.length() == 1) {
			return;
		} else {
			int savedWidth = width; //auxilary variable to store the previous width
			int savedHeight = height; //auxilary variable to store the previous height
			if (size > 0) { //representing A1, A2, A3 etc
				width = height / 2;
				height = savedWidth;
				calcSize("A" + (size - 1));
			} else {  //representing A00, A0000, A000000 etc
				height = width * 2;
				width = savedHeight;
				if (sheet.length() > 3) {
					calcSize(sheet.substring(0, sheet.length() - 2));
				}
			}
		}
	}
	
	private void run() {
		String paperSize = "A3";
		calcSize(paperSize);
		System.out.println(paperSize + " size is " + width + " x " + height);
	}
	
	public static void main(String[] args) {
		PaperSizes paper = new PaperSizes();
		paper.run();
	}
	
}



