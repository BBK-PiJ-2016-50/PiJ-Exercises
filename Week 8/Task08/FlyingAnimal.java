public class FlyingAnimal extends WalkingAnimal {
	
	private String name;
	
	public FlyingAnimal(String name) {
		super(name);
		this.name = name;
	}
	
	@Override
	public void call() {
		System.out.println(name + " now flying, will come later when tired...");
	}
	
}