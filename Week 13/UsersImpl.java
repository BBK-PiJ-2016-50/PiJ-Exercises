public class UsersImpl implements Users {
	
	private String name;
	private int libraryID;
	private Library lib;
	
	public UsersImpl(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
		
	public int getLibraryID() {
		return libraryID;
	}
		
	public int register(Library library) {
		this.lib = library;
		this.libraryID = lib.getID(this.name);
		return this.libraryID;
	}
	
	public String getLibrary() {
		return lib.getLibName();
	}
}