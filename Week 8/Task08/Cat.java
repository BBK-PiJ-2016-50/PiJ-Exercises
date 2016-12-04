public class Cat extends LandAnimal {
			
	public Cat(String name) {
		super(name);
		setIsMammalState(true);
	}

	@Override
	public void makeSound() {
		System.out.println("Meooow!");
	}
	
}