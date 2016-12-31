public class Matrix {
	
	private int[][] matrix;
	private int rows;
	private int cols;
	
	//constructor setting the size of the array
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
	
	//modify one element of the array
	public void setElement(int row, int col, int newVal) {
		if ((row <= this.rows && row >= 0) || (col <= this.cols && col >= 0)) {
			matrix[row][col] = newVal;
		} else {
			System.out.println("invalid indeces");
		}
	}
	
	//modifies one whole row of the array
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
	
	//modifies one whole column of the array
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
	
	//converts a string to an array
	private int[] stringToArray(String arrayStr) {
		String[] strNums = arrayStr.split(",");
		int[] nums = new int[strNums.length];
		for (int i = 0; i <= nums.length - 1; i++) {
			nums[i] = Integer.parseInt(strNums[i]);
		}
		return nums;
	}
	
	//returns the values in the array as a String
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
	
	//prints the values of the matrix on screen in a legible format
	public void prettyPrint() {
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= cols; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
	public boolean isSymmetrical() {
		MatrixChecker mc = new MatrixChecker();
		boolean isSym = mc.isSymmetrical2D(matrix);
		return isSym;
	}
	
	public boolean isTriangular() {
		MatrixChecker mc = new MatrixChecker();
		boolean isTri = mc.isTriangular(matrix);
		return isTri;
	}
	
	// takes a String representing the numbers to be put in the elements of the array
	public void setMatrix(String strArray) {
		String[] strRows = strArray.split(";");
		for (int i = 0; i <= strRows.length - 1; i++) {
			setRow(i, strRows[i]);
		}
	}
	
}

