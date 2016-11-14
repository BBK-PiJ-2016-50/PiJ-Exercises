public class ImplementPersonQueue implements PersonQueue {
	
	private Person firstPerson = null;
	private Person current = null;
	
	public void insert(Person person) {
		System.out.println(person.getName() + " joined the queue");
		if (firstPerson == null) {
			firstPerson = person;
		} else {
			current = firstPerson; 
			while (current.getNextPerson() != null) {
				current = current.getNextPerson();
			}
			current.setNextPerson(person);
		}
	}
	
	public Person retrieve() {
		Person retrieved = null;
		if (firstPerson == null) {
			return null;
		}
		
		if (firstPerson.getNextPerson() == null) {
			return null;
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