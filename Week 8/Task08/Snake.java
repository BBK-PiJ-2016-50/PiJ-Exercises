public class Snake extends LandAnimal {
			
	public Snake(String name) {
		super(name);
		setIsMammalState(false);
	}

	@Override
	public void makeSound() {
		System.out.println("Sssssss!");
	}
	
}