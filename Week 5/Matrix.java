public class Matrix {
	
	private int[][] matrix;
	
	public Matrix(int rows, int cols) {
		matrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				this.matrix[i][j] = 1;
			}
			
		}		
	}
	
	//public void setElement(int pos1, int pos2, int newVal) {
		//check indices are valid
		//modify the element of the array
		//if invalid method does nothing
	//}
	
	//public void setRow(int arrayRow, String numList) {
		//check index is valid and nums are correct (i.e. if aray has 3 columns the string contains 3 numbers)
		//modify one whole row of array
		//if invalid do nothing
	//}
	
	//public void setColumn(int arrayCol, String numList) {
		//check index is valid and nums are correct (i.e. if aray has 3 columns the string contains 3 numbers)
		//modify one whole column of array
		//if invalid do nothing
	//}
	
	//private String toString() {
		//returns values of array as a string "[1,2,3]"
	//}
	
	//public void prettyPrint() {
		//prints values of the matrix in legible format
	//}
	
}

