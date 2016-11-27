public class Supermarket {
		
	PersonQueue queue;
		
	public Supermarket() {
		queue = new ImplementPersonQueue();
	}
	
	public void addPerson(Person person) {
		queue.insert(person);
	}
	
	public Person servePerson() {
		return queue.retrieve();
	}
	
}