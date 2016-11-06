public class Matrix {
	
	private int[][] matrix;
	private int rows;
	private int cols;
	
	public Matrix(int rows, int cols) {
		this.rows = rows - 1;
		this.cols = cols - 1;
		matrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				this.matrix[i][j] = 1;
			}
		}		
	}
	
	public void setElement(int row, int col, int newVal) {
		if ((row <= this.rows && row >= 0) || (col <= this.cols && col >= 0)) {
			matrix[row][col] = newVal;
		} else {
			System.out.println("invalid indeces");
		}
	}
	
	public void setRow(int row, String numList) {
		int[] nums = stringToArray(numList);
		if ((row <= this.rows && row >= 0) && (nums.length - 1 == this.cols)) {
			for (int i = 0; i <= nums.length - 1; i++) {
				matrix[row][i] = nums[i];
			}
		} else {
			System.out.println("Either invalid row index or incorrect amount of values for columns entered");
		}
	}
	
	public void setColumn(int col, String numList) {
		int[] nums = stringToArray(numList);
		if ((col <= this.cols && col >= 0) && (nums.length - 1 == this.rows)) {
			for (int i = 0; i <= nums.length - 1; i++) {
				matrix[i][col] = nums[i];
			}
		} else {
			System.out.println("Either invalid column index or incorrect amount of values for rows entered");
		}
	}
	
	private int[] stringToArray(String arrayStr) {
		String[] strNums = arrayStr.split(",");
		int[] nums = new int[strNums.length];
		for (int i = 0; i <= nums.length - 1; i++) {
			nums[i] = Integer.parseInt(strNums[i]);
		}
		return nums;
	}

	public String toString() {
		String strArray = "[";
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= cols; j++) {
				strArray += matrix[i][j];
			}
			if (i != rows) {
				strArray += ";";
			}
		}
		strArray += "]";
		return strArray;
	}
	
	public void prettyPrint() {
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= cols; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
}

