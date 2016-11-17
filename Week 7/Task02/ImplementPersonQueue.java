public class ImplementPersonQueue implements PersonQueue {
	
	private Person[] queue = new Person[5];  //create new queue as array
	private int queueCounter = 0;  //number of people in queue
	private int nextCounter = 0;  //needed to be able to get the first person from the queue
	
	public void insert(Person person) {
		queue[queueCounter] = person;
		queueCounter++;
		System.out.println(person.getName() + " joined the queue");
	}
	
	public Person retrieve() {
		if (queueCounter == 0) {
			return null;
		} else {
			Person retrieved = queue[nextCounter];
			System.out.println(retrieved.getName() + " was served");
			nextCounter++;
			return retrieved;
		}
	}
	
}