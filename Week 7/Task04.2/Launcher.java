public class Launcher {
	
	public static void main(String[] args) {
				
		Supermarket myMarket = new Supermarket();
		myMarket.addPerson(new Person("Mark", 12));
		myMarket.addPerson(new Person("Matt", 22));
		myMarket.addPerson(new Person("Luke", 33));
		myMarket.addPerson(new Person("Sonia", 66));
		myMarket.addPerson(new Person("Jess", 78));
		myMarket.addPerson(new Person("James", 19));
		myMarket.addPerson(new Person("Kate", 33));
		myMarket.addPerson(new Person("Emma", 15));
		myMarket.addPerson(new Person("Sarah", 45));
		myMarket.servePerson();
		myMarket.servePerson();
		myMarket.addPerson(new Person("John", 33));
		myMarket.servePerson();
		myMarket.servePerson();
		myMarket.addPerson(new Person("Simon", 80));
		myMarket.servePerson();
		myMarket.servePerson();
		myMarket.servePerson();
		myMarket.servePerson();
		myMarket.servePerson();
		myMarket.servePerson();
		
    }

	
}