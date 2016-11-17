public class Launcher {
	
	public static void main(String[] args) {
				
		Supermarket myMarket = new Supermarket();
		myMarket.addPerson(new Person("Mark", 20));
		myMarket.addPerson(new Person("Matt", 22));
		myMarket.addPerson(new Person("Luke", 33));
		myMarket.servePerson();
		myMarket.servePerson();
		myMarket.servePerson();
		myMarket.addPerson(new Person("John", 33));
		myMarket.servePerson();
    }

	
}