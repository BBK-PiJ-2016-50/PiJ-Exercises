public class Patient {
	
  private String name;
  private int yearOfBirth;
	private Patient next;
	
  public Patient(String name, int yearOfBirth) {
	  this.name = name;
		this.yearOfBirth = yearOfBirth;
		int currentYear = 2017;
		int age = currentYear - yearOfBirth;
		if (age > 130 || age < 0) {
			throw new IllegalArgumentException();
		}
	}

  public void setNext(Patient patient) {
		next = patient;
	}

  public Patient getNext() {
		return next;
	}
	
	public String getName() {
		return name;
	}

  public int getYearOfBirth() {
		return yearOfBirth;
	}
	
}