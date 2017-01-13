public class HospitalManager {

	private Patient firstPatient = null;
	private Patient current = null;
	
	public void addPatient(Patient newPatient) {
		if (firstPatient == null) {
			firstPatient = newPatient;
			firstPatient.setNextPatient(firstPatient);
			return;
		}
		
		current = this.firstPatient;
		while (current.getNextPatient() != firstPatient) {
			current = current.getNextPatient();
		}
		current.setNextPatient(newPatient);
		newPatient.setNextPatient(firstPatient);
	}
	
	public boolean deletePatient(String name) {		
		if (firstPatient == null) {
			System.out.println("No Records to Delete");
			return false;
		}
		
		if (firstPatient.getName().equals(name)) {
			if (firstPatient.getNextPatient() == firstPatient) {
				firstPatient = null;
			} else {
				current = firstPatient;
				while (current.getNextPatient() != firstPatient) {
					current = current.getNextPatient();
				}
				current.setNextPatient(firstPatient.getNextPatient());
				
				firstPatient = firstPatient.getNextPatient();
			} 
			return true;
		}
		
		current = firstPatient;
		
		while (current.getNextPatient() != firstPatient) {
			if (current.getNextPatient().getName().equals(name)){
				current.setNextPatient(current.getNextPatient().getNextPatient());
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
		} while (current != firstPatient); 
		return result;
	}
	
}
