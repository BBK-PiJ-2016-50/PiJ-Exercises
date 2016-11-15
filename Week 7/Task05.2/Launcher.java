public class Launcher {
	
	public static void main(String[] args) {
		Launcher script = new Launcher();
		script.launch();
	}
	
	private void launch() {
		SimpleMap myMap = new ImplementSimpleMap();
		performMap(myMap);
	}
	
	private void performMap(SimpleMap map) {
		map.put(10, "ten");
		map.put(2, "two");
		map.put(3, "fifty");
		System.out.println(map.get(2));
		map.remove(2);
		map.remove(10);
		map.remove(6);
		System.out.println(map.isEmpty());
	}
	
	
	
}