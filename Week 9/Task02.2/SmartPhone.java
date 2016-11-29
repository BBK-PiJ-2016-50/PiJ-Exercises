public class SmartPhone extends MobilePhone {
	
	public void browseWeb(String search) {
		System.out.println("Search query: " + search);
	}

	public String findPosition() {
		String gpsPosition = "123456789";
		return gpsPosition;
	}
	
}