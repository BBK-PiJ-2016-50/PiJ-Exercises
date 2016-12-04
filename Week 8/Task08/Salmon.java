public class Salmon extends SwimmingAnimal {
			
	public Salmon(String name) {
		super(name);
		setIsMammalState(false);
	}

	@Override
	public void makeSound() {
		System.out.println("Silence!");
	}
	
}