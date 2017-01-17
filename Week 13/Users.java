public interface Users {

	/**
	  * Gets name
	  */
	String getName();
	
	/**
      * Gets Library ID
	  */	
	int getLibraryID();
	
	/**
      * Registers user at library and returns Library ID
	  */	
	int register(Library library);
	
	/**
      * Gets library user registered with
	  */		
	String getLibrary();
	
}