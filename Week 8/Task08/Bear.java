public class Bear extends LandAnimal {
			
	public Bear(String name) {
		super(name);
		setIsMammalState(true);
	}

	@Override
	public void makeSound() {
		System.out.println("Growl!");
	}
	
}