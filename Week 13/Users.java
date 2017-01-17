public interface Users {

	/**
	  * Gets name
	  */
	public String getName();
	
	/**
      * Gets Library ID
	  */	
	public int getLibraryID();
	
	/**
      * Registers user at library and returns Library ID
	  */	
	public int register(Library library);
	
	/**
      * Gets library user registered with
	  */		
	public String getLibrary();
	
}