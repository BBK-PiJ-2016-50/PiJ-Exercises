public class PhoneLauncher {
	
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	private void launch() {
		MobilePhone myPhone = new SmartPhone();
		testPhone(myPhone); // passing myPhone object to new method
	}
	
	private void testPhone(Phone phone) {
		phone.call("1");
		//phone.ringAlarm("ring ring");
		//phone.playGame("rubbish game");
		//phone.printLastNumbers();
		//phone.browseWeb("browsing for food");
		//System.out.println("GPS Position: " + phone.findPosition());
	}
	
}

//the testPhone method can only call the method declared in the Phone interface
//other methods could be called within testPhone by down casting