public class Target {
	
	private int targetSize;
	private int[][][] target;
	private int iRandom;  //left or right
	private int jRandom;  //high or low
	private int kRandom;  //short or long
	
	public Target(int targetSize) {
		this.targetSize = targetSize;
		target = new int[targetSize][targetSize][targetSize];
		for (int i = 0; i < targetSize; i++) {
			for (int j = 0; j < targetSize; j++) {
				for (int k = 0; k < targetSize; k++) {
					this.target[i][j][k] = 0;
				}
			}
		}
		init();
	}
	
	private void init() {
		iRandom = (int) Math.abs(targetSize * Math.random());
		jRandom = (int) Math.abs(targetSize * Math.random());
		kRandom = (int) Math.abs(targetSize * Math.random());
		this.target[iRandom][jRandom][kRandom] = 1;
	}
	
	public Result fire(int i, int j, int k) {
		if (i == iRandom && j == jRandom && k == kRandom) {
			return Result.HIT;
		} else if (i > targetSize || i < 0 || j > targetSize || j < 0 || k > targetSize || k < 0) {
			return Result.OUT_OF_RANGE;
		} else if (i < iRandom) {
			return Result.FAIL_LEFT;
		} else if (i > iRandom) {
			return Result.FAIL_RIGHT;
		} else if (j < jRandom) {
			return Result.FAIL_HIGH;
		} else if (j > jRandom) {
			return Result.FAIL_LOW;
		} else if (k < kRandom) {
			return Result.FAIL_SHORT;
		} else if (k > kRandom) {
			return Result.FAIL_LONG;
		} 
		return Result.OUT_OF_RANGE;
	}
	
}