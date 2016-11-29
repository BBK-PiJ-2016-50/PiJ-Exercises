public class PhoneLauncher {
	
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	private void launch() {
		MobilePhone myPhone = new MobilePhone();
		testPhone(myPhone); // passing myPhone object to new method
	}
	
	private void testPhone(Phone phone) {
		SmartPhone sp = (SmartPhone) phone;
		sp.call("1");
		sp.ringAlarm("ring ring");
		sp.playGame("rubbish game");
		sp.printLastNumbers();
		sp.browseWeb("browsing for food");
		System.out.println("GPS Position: " + sp.findPosition());
	}
	
}

//passing a MobilePhone object to the testPhone method, 
//and then downcasting to SmartPhone gives a ClassCastException
//a MobilePhone is not a SmartPhone