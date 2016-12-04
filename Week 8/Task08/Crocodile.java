public class Crocodile extends LandAnimal {
			
	public Crocodile(String name) {
		super(name);
		setIsMammalState(false);
	}

	@Override
	public void makeSound() {
		System.out.println("Snap snap!");
	}
	
}