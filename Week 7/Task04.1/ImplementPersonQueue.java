public class ImplementPersonQueue implements PersonQueue {
	
	private Person lastPerson = null;
	private Person current = null;
	
	public void insert(Person person) {
		System.out.println(person.getName() + " joined the queue");
		if (lastPerson == null) {
			lastPerson = person;
		} else {
			current = person;
			current.setNextPerson(lastPerson);
			lastPerson = current;	
		}
	}
	
	public Person retrieve() {
		Person retrieved = null;
		if (lastPerson == null) {
			return null;
		}
		if (lastPerson.getNextPerson() == null) {
			retrieved = lastPerson;
			System.out.println(retrieved.getName() + " was served");
			return retrieved;
		}
		
		retrieved = lastPerson;
		current = retrieved;
		
		//identifies the oldest customer
		while (current != null) {
			if (current.getAge() > retrieved.getAge()) {
				retrieved = current;
			}
			current = current.getNextPerson();
		}
	
		//re-point links based on the oldest customer being retrieved
		current = lastPerson;
		boolean finished = false;
		while (!finished && current.getNextPerson() != null) {
			if (current.equals(retrieved)) {
				lastPerson = current.getNextPerson();
				current.setNextPerson(null);
				finished = true;
			} else if (!current.getNextPerson().equals(retrieved)) {
				current = current.getNextPerson();
			} else {
				current.setNextPerson(retrieved.getNextPerson());
				finished = true;
			} 
		}
		
		System.out.println(retrieved.getName() + " was served");
		return retrieved;
	}
	
}