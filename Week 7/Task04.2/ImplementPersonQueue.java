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
		Person over65 = null;
		Person over18 = null;
		if (lastPerson == null) {
			return null;
		}
		
		//if one person in the queue, only serve if over 18
		if (lastPerson.getNextPerson() == null && lastPerson.getAge() > 18) {
			retrieved = lastPerson;
			lastPerson = null;
			System.out.println(retrieved.getName() + " was served");
			return retrieved;
		//if they are under 18 don't serve them
		} else if (lastPerson.getNextPerson() == null && lastPerson.getAge() <= 18) {
			System.out.println(lastPerson.getName() + " is not over 18.  Not served");
			return null;
		//if there are multiple people in the queue then work out who to serve based on age
		} else {
			//find person over 65, if any, who is closest to the front
			current = lastPerson;
			while (current != null) {
				if (current.getAge() > 65) {
					over65 = current;
				}
				current = current.getNextPerson();
			}
			//if no people over 65 in queue, find person over 18, if any who is closest to the front
			if (over65 == null) {
				current = lastPerson;
				while (current != null) {
					if (current.getAge() > 18) {
						over18 = current;
					}
					current = current.getNextPerson();
				}
			}
			//assign correct person, based on age, to the retrieved variable
			if (over65 != null) {
				retrieved = over65;
			} else if (over18 != null) {
				retrieved = over18;
			}
			//re-point links based on the customer being retrieved
			if (retrieved != null) {
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
			} else {
				System.out.println("No one left in the queue is over 18.  No more serving");
				return null;
			}
		}
	}
	
}