public class Launcher {

	public static void main(String[] args) {
		
		HospitalManager hospital = new HospitalManager();
		
		Patient one = new Patient("One",15,"ABC1");
		Patient two = new Patient("Two",16,"ABC2");
		Patient three = new Patient("Three",17,"ABC3");
		Patient four = new Patient("Four",18,"ABC4");
		Patient five = new Patient("Five",19,"ABC5");
		Patient six = new Patient("Six",15,"ABC6");
		Patient seven = new Patient("Seven",16,"ABC2");
		Patient eight = new Patient("Eight",17,"ABC3");
		Patient nine = new Patient("Nine",18,"ABC4");
		Patient ten = new Patient("Ten",19,"ABC5");
		Patient eleven = new Patient("Eleven",20,"ABC6");
		
		hospital.addPatient(one);
		hospital.addPatient(two);
		hospital.addPatient(three);
		hospital.addPatient(four);
		hospital.addPatient(five);
		hospital.addPatient(six);
		hospital.addPatient(seven);
		hospital.addPatient(eight);
		hospital.addPatient(nine);
		hospital.addPatient(ten);
		hospital.printRecordsForwards();
		hospital.printRecordsBackwards();
				
		hospital.deletePatient("Ten");
		hospital.deletePatient("One");
		hospital.addPatient(eleven);
		hospital.deletePatient("sdfhgsjfg");
		hospital.printRecordsForwards();
		hospital.printRecordsBackwards();
		
	}
	
}