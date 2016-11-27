public class ImplementPersonQueue implements PersonQueue {
	
	private Person firstPerson = null;
	private Person current = null;
	
	public void insert(Person person) {
		System.out.println(person.getName() + " joined the queue");
		if (firstPerson == null) {
			firstPerson = person;
		} else {
			current = person;
			current.setNextPerson(firstPerson);
			firstPerson = current;	
		}
	}
	
	public Person retrieve() {
		Person retrieved = null;
		if (firstPerson == null) {
			return null;
		}
		
		if (firstPerson.getNextPerson() == null) {
			retrieved = firstPerson;
			firstPerson = null;
			System.out.println(retrieved.getName() + " was served");
			return retrieved;
		}
		
		current = firstPerson;
		while (current.getNextPerson().getNextPerson() != null) {
			current = current.getNextPerson();
		}
		retrieved = current.getNextPerson();
		current.setNextPerson(null);
		System.out.println(retrieved.getName() + " was served");
		return retrieved;
	}
	
}