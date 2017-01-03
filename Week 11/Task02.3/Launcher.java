public class Launcher {
	
	public static void main(String[] args) {
		Launcher script = new Launcher();
		script.launch();
	}
	
	public void launch() {
		ListIntSet list = new ListIntSet();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(2);
		list.add(9);
		list.add(3);
		
		System.out.println(list.toString());
		System.out.println(list.contains(3));
		System.out.println(list.contains(100));
		
		list.containsVerbose(9);
		
	}
	
}