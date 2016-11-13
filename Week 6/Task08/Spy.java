public class Spy {
	
	private static int spyCount = 0;
	private int ID;
	
	public Spy(int id) {
		this.ID = id;
		spyCount++;
		System.out.println("Spy ID: " + this.ID);
		System.out.println("Spy count is now: " + spyCount);
	}
	
	public void die() {
		spyCount--;
		System.out.println("Spy " + this.ID + " has been detected and eliminated");
		System.out.println("Spy count is now: " + spyCount);
	}
	
}