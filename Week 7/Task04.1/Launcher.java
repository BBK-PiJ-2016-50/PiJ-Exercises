public class Launcher {
	
	public static void main(String[] args) {
				
		Supermarket myMarket = new Supermarket();
		myMarket.addPerson(new Person("Mark", 200));
		myMarket.addPerson(new Person("Matt", 48));
		myMarket.addPerson(new Person("Luke", 33));
		myMarket.servePerson();
		myMarket.servePerson();
		myMarket.addPerson(new Person("John", 78));
		myMarket.servePerson();
		myMarket.servePerson();
    }

	
}