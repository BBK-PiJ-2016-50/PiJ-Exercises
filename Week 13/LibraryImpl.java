public class LibraryImpl implements Library {
	
	private String libName;
	private int maxBooks;
	private String[] users;
	private int userCount;
	
	public LibraryImpl(String name, int maxBooks) {
		this.libName = name;
		this.maxBooks = maxBooks;
		this.users = new String[5];
		this.userCount = 0;
	}
	
	public String getLibName() {
		return this.libName;
	}

	public int getID(String name) {
		for (int i = 0; i < userCount; i++) {
			if (users[i].equals(name)) {
				return i + 1;
			}
		}
		users[userCount] = name;
		userCount++;
		return userCount;
	}
	
	public int getMaxNumberOfBooks() {
		return this.maxBooks;
	}
  
}