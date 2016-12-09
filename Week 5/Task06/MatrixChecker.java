public class MatrixChecker {
	
	public boolean isSymmetrical(int[] myArray) {
		int arrayLength = myArray.length;
		for (int i = 0; i < arrayLength / 2; i++) {
			if (myArray[i] != myArray[arrayLength - 1 - i]) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isSymmetrical2D(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] != matrix[col][row]) {
					return false;
				}
			}
		}
		return true;	
	}
	
	public boolean isTriangular(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] != 0 && row < col) {
					return false;
				}
			}
		}
		return true;
	}
	
}