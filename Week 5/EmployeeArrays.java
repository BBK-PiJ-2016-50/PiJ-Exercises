public class EmployeeArrays {
	
	private String[] names = new String[5];
	private int[] ids = new int[5];
	private int counter = 0;
	
	public void addNameToArray(String name) {
		counter++;
		if ((names.length - 1) == counter) {
			String[] namesCopy = new String[names.length * 2];
			String[] copy = copyNameArray(names, namesCopy);
			names = copy;
		}
		names[counter] = name;
	}
	
	public void addIdToArray(int id) {
		if ((ids.length - 1) == counter) {
			int[] idsCopy = new int[ids.length * 2];
			int[] copy = copyIdArray(ids, idsCopy);
			ids = copy;
		}
		ids[counter] = id;
	}
	
	public String[] getNames() {
		return names;
	}
	
	public int[] getIds() {
		return ids;
	}
	
	private String[] copyNameArray(String[] source, String[] dest) {
		for (int i = 0; i < source.length - 1; i++) {
			dest[i] = source[i];
		}
		return dest;
	}
	
	private int[] copyIdArray(int[] source, int[] dest) {
		for (int i = 0; i < source.length - 1; i++) {
			dest[i] = source[i];
		}
		return dest;
	}
		
}