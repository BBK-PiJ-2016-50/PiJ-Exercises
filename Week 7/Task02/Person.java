public class Person {
	
	private String name;
	private int age;
	private Person nextPerson;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.nextPerson = null;
	}
	
	public Person getNextPerson() {
		return nextPerson;
	}

	public void setNextPerson(Person newPerson) {
		nextPerson = newPerson;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}

}
