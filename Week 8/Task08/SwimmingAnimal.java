public class SwimmingAnimal extends WalkingAnimal {
	
	private String name;
	
	public SwimmingAnimal(String name) {
		super(name);
		this.name = name;
	}
	
	@Override
	public void call() {
		System.out.println(name + " will not come...");
	}
	
}