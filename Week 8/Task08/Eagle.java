public class Eagle extends FlyingAnimal {
			
	public Eagle(String name) {
		super(name);
		setIsMammalState(false);
	}

	@Override
	public void makeSound() {
		System.out.println("Squawk!");
	}
	
}