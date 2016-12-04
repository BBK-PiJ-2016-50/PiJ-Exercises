public class Lizard extends LandAnimal {
			
	public Lizard(String name) {
		super(name);
		setIsMammalState(true);
	}

	@Override
	public void makeSound() {
		System.out.println("Raaa!");
	}
	
}