public class MobilePhone extends OldPhone {
	
	private String[] lastTenNumbers = new String[10];
	private int length = lastTenNumbers.length;
	
	public MobilePhone(String brand) {
		super(brand);		
	}
	
	@Override
	public void call(String number) {
		super.call(number);
		for (int i = 0; i < length; i++) {
			if (i == 9 && lastTenNumbers[i] != null) {
				lastTenNumbers[0] = lastTenNumbers[1];
				lastTenNumbers[1] = lastTenNumbers[2];
				lastTenNumbers[2] = lastTenNumbers[3];
				lastTenNumbers[3] = lastTenNumbers[4];
				lastTenNumbers[4] = lastTenNumbers[5];
				lastTenNumbers[5] = lastTenNumbers[6];
				lastTenNumbers[6] = lastTenNumbers[7];
				lastTenNumbers[7] = lastTenNumbers[8];
				lastTenNumbers[8] = lastTenNumbers[9];
				lastTenNumbers[9] = number;
			}
			if (lastTenNumbers[i] == null) {
				lastTenNumbers[i] = number;
				return;
			}
		}
		
	}
	
	public void ringAlarm(String alarm) {
		System.out.println("Alarm ringing: " + alarm);
	}
	
	public void playGame(String game) {
		System.out.println("Playing game: " + game);
	}
	
	public void printLastNumbers() {
		System.out.println("Last 10 numbers called:");	
		for (int i = 0; i < length; i++) {
			if (lastTenNumbers[i] != null) {
				System.out.println(lastTenNumbers[i]);
			}
		}
	}
	
}