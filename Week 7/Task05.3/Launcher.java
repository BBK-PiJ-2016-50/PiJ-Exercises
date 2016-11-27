public class Launcher {
	
	public static void main(String[] args) {
		Launcher script = new Launcher();
		script.launch();
	}
	
	private void launch() {
		SimpleMap myMap = new ImplementsSimpleMap();
		performMap(myMap);
	}
	
	private void performMap(SimpleMap map) {
		map.put(10, "ten");
		map.put(2, "two");
		map.put(3, "three");
		map.put(3, "different value");
		printValues(map.get(3));
		map.remove(2, "two");
		map.remove(3, "three");
		printValues(map.get(3));
		System.out.println(map.isEmpty());
	}
	
	private void printValues(String[] stringArray) {
		String[] values = stringArray;
		for (int i = 0; i < values.length; i++) {
			if (values[i] != null) {
				System.out.println(values[i]);
			}
		}
	}
	
}