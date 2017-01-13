public class IntObj {
	
	private int num;
	private IntObj nextNum;
	
	public IntObj(int value) {
		this.num = value;
	}
	
	public int getIntValue() {
		return num;
	}
	
	public IntObj getNextNum() {
		return nextNum;
	}
	
	public void setNextNum(IntObj value) {
		this.nextNum = value;
	}
}