public class HospitalManager {

	private Patient firstPatient = null;
	private Patient current= null;
	
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
			} 
			return true;
		}
		
		Patient current = firstPatient;
		
		while (current.getNextPatient() != null) {
			if (current.getNextPatient().getName().equals(name)){
				current.setNextPatient(current.getNextPatient().getNextPatient());
				return true;
			}
			current = current.getNextPatient();
		}
		return false;
	}
	
	public void printRecords(){
		if (firstPatient == null) {
			System.out.println("No Records to Print!");
			return;
		}
		
		Patient current = firstPatient;
		
		do {
			System.out.println ("Name: "+current.getName()+"\t Age: "+current.getAge()+"\t Illness: "
			+current.getIllness());
			current = current.getNextPatient();
		} while (current != null);

	}
}
