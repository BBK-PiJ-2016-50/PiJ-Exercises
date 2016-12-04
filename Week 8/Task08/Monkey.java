public class Monkey extends LandAnimal {
			
	public Monkey(String name) {
		super(name);
		setIsMammalState(true);
	}

	@Override
	public void makeSound() {
		System.out.println("Screeeech!");
	}
	
}