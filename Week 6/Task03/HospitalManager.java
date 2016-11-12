public class HospitalManager {

	private Patient firstPatient = null;
	private Patient current = null;
	
	public void addPatient(Patient newPatient) {
		if (firstPatient == null) {
			firstPatient = newPatient;
			return;
		}
		
		current = this.firstPatient;
		while (current.getNextPatient() != null) {
			current = current.getNextPatient();
		}
		current.setNextPatient(newPatient);
		newPatient.setPrevPatient(current);
	}
	
	public boolean deletePatient(String name) {		
		if (firstPatient == null) {
			System.out.println("No Records to Delete");
			return false;
		}
		
		if (firstPatient.getName().equals(name)) {
			if (firstPatient.getNextPatient() == null) {
				firstPatient = null;
			} else {
				firstPatient = firstPatient.getNextPatient();
				firstPatient.setPrevPatient(null);
			} 
			return true;
		}
		
		Patient current = firstPatient;
		
		while (current.getNextPatient() != null) {
			if (current.getNextPatient().getName().equals(name)){
				current.setNextPatient(current.getNextPatient().getNextPatient());
				if (current.getNextPatient() != null) {
					current.getNextPatient().setPrevPatient(current);
				}
				return true;
			}
			current = current.getNextPatient();
		}
		return false;
	}
	
	public void printRecordsForwards() {
		if (firstPatient == null) {
			System.out.println("No Records to Print!");
			return;
		}
		
		current = firstPatient;
		
		do {
			System.out.println ("Name: " + current.getName() + "\t Age: " + current.getAge() + "\t Illness: "
			+ current.getIllness());
			current = current.getNextPatient();
		} while (current != null); 
	}
	
	public void printRecordsBackwards() {
		if (firstPatient == null) {
			System.out.println("No Records to Print!");
			return;
		}
		
		current = firstPatient;
		
		while (current.getNextPatient() != null) {
			current = current.getNextPatient();
		}
		
		do {
			System.out.println ("Name: " + current.getName() + "\t Age: " + current.getAge() + "\t Illness: "
			+ current.getIllness());
			current = current.getPrevPatient();
		} while (current != null);
		
	}
	
	public int patientListLength(){
		int counter = 0;
		if (firstPatient == null) {
			return counter;
		} 
		current = firstPatient;
		do {
			counter++;
			current = current.getNextPatient();
		} while (current != null);
		return counter;

	}

}
