public class Frog extends LandAnimal {
			
	public Frog(String name) {
		super(name);
		setIsMammalState(false);
	}

	@Override
	public void makeSound() {
		System.out.println("Ribbit!");
	}
	
}