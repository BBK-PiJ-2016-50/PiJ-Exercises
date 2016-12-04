public class Shark extends SwimmingAnimal {
			
	public Shark(String name) {
		super(name);
		setIsMammalState(false);
	}

	@Override
	public void makeSound() {
		System.out.println("Shark based sounds!");
	}
	
}