public class RestrictedSmartPhone extends SmartPhone {
	
	public RestrictedSmartPhone(String brand) {
		super(brand);		
	}
	
	@Override
	public void playGame(String game) {
		System.out.println("You do not have access to this");
	}
	
}

//it doesn't look like this is possible because you can't override 
//public methods to make them more private
//what i have done is to override the inherited method 
//and make the game playing options unavailable