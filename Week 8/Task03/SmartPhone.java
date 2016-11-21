public class SmartPhone extends MobilePhone {
	
	public SmartPhone(String brand) {
		super(brand);		
	}
	
	@Override
	public void call(String number) {
		if (number.startsWith("00")){
			browseWeb(number);
		} else {
			super.call(number);
		}
	}
	
	public void browseWeb(String search) {
		System.out.println("Search query: " + search);
	}
	
	public String findPosition() {
		String gpsPosition = "123456789";
		return gpsPosition;
	}
	
}