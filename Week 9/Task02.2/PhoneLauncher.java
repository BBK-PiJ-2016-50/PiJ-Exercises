public class PhoneLauncher {
	
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		MobilePhone myPhone = new SmartPhone();
		SmartPhone sp = (SmartPhone) myPhone; // downcasting
		sp.call("1");
		sp.ringAlarm("ring ring");
		sp.playGame("rubbish game");
		sp.printLastNumbers();
		sp.browseWeb("browsing for food");
		System.out.println("GPS Position: " + sp.findPosition());
	}
	
}

//doesn't compile because browseWeb and findPosition methods are not implemented in the mobilePhone class
//you can only upcast the methods which the class has heirarchical access to

//downcasting solves this problem