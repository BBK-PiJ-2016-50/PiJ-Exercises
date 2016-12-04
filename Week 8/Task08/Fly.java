public class Fly extends FlyingAnimal {
			
	public Fly(String name) {
		super(name);
		setIsMammalState(false);
	}

	@Override
	public void makeSound() {
		System.out.println("Buzzzzz!");
	}
	
}