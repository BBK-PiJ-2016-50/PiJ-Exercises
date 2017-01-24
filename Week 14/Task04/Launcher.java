public class Launcher {
	
  public static void main(String[] args) {
    Launcher script = new Launcher();
		script.launch();
  }
  
  Patient head = null;
	Patient current = null;
  	
  private void launch() {
		String numPatients = System.console().readLine("How many patients: ");
		int numPatientsInt = Integer.parseInt(numPatients);
		int counter = 0;
		while (counter < numPatientsInt) {
		  String name = System.console().readLine("Name: ");
		  String birthYear = System.console().readLine("Year of Birth: ");
		  int birthYearInt = Integer.parseInt(birthYear);
		  Patient newPatient = new Patient(name, birthYearInt);
			if (head == null) {
				head = newPatient;
			} else {
				current = head;
				while (current.getNext() != null) {
					current = current.getNext();
				}
				current.setNext(newPatient);
			}
			counter++;
		}	
	}
	
}