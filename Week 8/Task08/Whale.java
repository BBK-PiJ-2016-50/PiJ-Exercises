public class Whale extends SwimmingAnimal {
			
	public Whale(String name) {
		super(name);
		setIsMammalState(true);
	}

	@Override
	public void makeSound() {
		System.out.println("Whistlesss!");
	}
	
}