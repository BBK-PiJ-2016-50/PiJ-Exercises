public class Beetle extends FlyingAnimal {
	
	public Beetle(String name) {
		super(name);
		setIsMammalState(false);
	}

	@Override
	public void makeSound() {
		System.out.println("Buzzzz!");
	}
	
}