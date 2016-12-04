public class Dolphin extends SwimmingAnimal {
			
	public Dolphin(String name) {
		super(name);
		setIsMammalState(true);
	}

	@Override
	public void makeSound() {
		System.out.println("High pitched whistle!");
	}
	
}