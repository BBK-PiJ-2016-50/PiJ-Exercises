public class PhoneLauncher {
	
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		SmartPhone myPhone = new SmartPhone();
		myPhone.call("1");
		myPhone.ringAlarm("ring ring");
		myPhone.playGame("rubbish game");
		myPhone.printLastNumbers();
		myPhone.browseWeb("browsing for food");
		System.out.println("GPS Position: " + myPhone.findPosition());
	}
	
}