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
	
	public String printRecordsForwards() {
		if (firstPatient == null) {
			return "No Records to Print!";
		}
		
		current = firstPatient;
		String result = "";
		do {
			result += (current.getName() + " ");
			current = current.getNextPatient();
		} while (current != null); 
		return result;
	}
	
	public String printRecordsBackwards() {
		if (firstPatient == null) {
			return "No Records to Print!";
		}
		
		current = firstPatient;
		String result = "";
		while (current.getNextPatient() != null) {
			current = current.getNextPatient();
		}
		
		do {
			result += (current.getName() + " ");
			current = current.getPrevPatient();
		} while (current != null);
		return result;
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
