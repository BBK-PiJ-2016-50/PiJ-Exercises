public class PhoneLauncher {
	
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.call("1");
		smartPhone.call("2");
		smartPhone.call("3");
		smartPhone.call("4");
		smartPhone.call("5");
		smartPhone.call("6");
		smartPhone.call("7");
		smartPhone.call("8");
		smartPhone.call("9");
		smartPhone.call("10");
		smartPhone.call("11");
		smartPhone.call("12");
		smartPhone.call("13");
		smartPhone.ringAlarm("ring ring");
		smartPhone.playGame("rubbish game");
		smartPhone.printLastNumbers();
		smartPhone.browseWeb("browsing for food");
		System.out.println("GPS Position: " + smartPhone.findPosition());
	}
	
}