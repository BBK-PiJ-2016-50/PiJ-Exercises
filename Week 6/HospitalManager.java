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
		boolean done = false;
		if (firstPatient == null) {
			System.out.println("No Records to Delete");
		}
		
		if (firstPatient.getName().equals(name)) {
			if (firstPatient.getNextPatient() == null) {
				firstPatient = null;
			} else {
				firstPatient = firstPatient.getNextPatient();
			} 
			done = true;
		}
		
		Patient current = firstPatient;
		
		while (current.getNextPatient() != null) {
			if (current.getNextPatient().getName().equals(name)){
				current.setNextPatient(current.getNextPatient().getNextPatient());
				return true;
			}
			current = current.getNextPatient();
		}
		return done;
	}
	
	public void printRecords(){
		if (firstPatient == null) {
			System.out.println("No Records to Print!");
			return;
		}
		
		current = firstPatient;
		while (current.getNextPatient() != null) {
			System.out.println ("Name: "+current.getName()+"\t Age: "+current.getAge()+"\t Illness: "
			+current.getIllness());
			current = current.getNextPatient();
		}
		System.out.println ("Name: "+current.getName()+"\t Age: "+current.getAge()+"\t Illness: "
			+current.getIllness()+"\n");
	}
}
