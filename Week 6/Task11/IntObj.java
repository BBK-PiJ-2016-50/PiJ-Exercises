public class IntObj {
	
	private int num;
	private IntObj nextNum = null;
	private IntObj prevNum = null;
	
	public IntObj(int value) {
		this.num = value;
		this.nextNum = null;
		this.prevNum = null;
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
	
	public IntObj getPrevNum() {
		return prevNum;
	}
	
	public void setPrevNum(IntObj value) {
		this.prevNum = value;
	}
}