public class LandAnimal implements Animal {
	
	private String name;
	private boolean isMammal;
	
	public LandAnimal(String name) {
		this.name = name;
		this.isMammal = isMammal;
	}
	
	public void setIsMammalState(boolean state) {
		isMammal = state;
	}
	
	public void call() {
		System.out.println(name + " coming...");
	}
	
	public void reproduce() {
		if (isMammal) {
			giveBirth();
		} else {
			layEggs();
		}
	}
	
	private void giveBirth() {
		System.out.println(name + " giving birth");
	}
	
	private void layEggs() {
		System.out.println(name + " laying eggs");
	}
	
	public void makeSound() {
		System.out.println();
	} 
	
}