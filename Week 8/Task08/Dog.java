public class Dog extends LandAnimal {
			
	public Dog(String name) {
		super(name);
		setIsMammalState(true);
	}

	@Override
	public void makeSound() {
		System.out.println("Woof!");
	}
	
}