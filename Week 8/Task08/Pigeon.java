public class Pigeon extends FlyingAnimal {
			
	public Pigeon(String name) {
		super(name);
		setIsMammalState(false);
	}

	@Override
	public void makeSound() {
		System.out.println("Coo cooo!");
	}
	
}