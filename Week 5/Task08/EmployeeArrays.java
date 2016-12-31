public class EmployeeArrays {
	
	private String[] names = new String[2];
	private int[] ids = new int[2];
	private int counter = 0;
	
	//adds name to names array
	public void addNameToArray(String name) {
		counter++;
		if ((names.length - 1) == counter) {
			String[] namesCopy = new String[names.length * 2];
			String[] copy = copyNameArray(names, namesCopy);
			names = copy;
		}
		names[counter] = name;
	}
	
	//adds id to ids array
	public void addIdToArray(int id) {
		if ((ids.length - 1) == counter) {
			int[] idsCopy = new int[ids.length * 2];
			int[] copy = copyIdArray(ids, idsCopy);
			ids = copy;
		}
		ids[counter] = id;
	}
	
	//returns the names array
	public String[] getNames() {
		return names;
	}
	
	//returns the ids array
	public int[] getIds() {
		return ids;
	}
	
	//copies the names array to create a larger array
	private String[] copyNameArray(String[] source, String[] dest) {
		for (int i = 0; i < source.length - 1; i++) {
			dest[i] = source[i];
		}
		return dest;
	}
	
	//copies the ids array to create a larger array
	private int[] copyIdArray(int[] source, int[] dest) {
		for (int i = 0; i < source.length - 1; i++) {
			dest[i] = source[i];
		}
		return dest;
	}
		
}