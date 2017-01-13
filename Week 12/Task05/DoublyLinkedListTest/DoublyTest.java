import org.junit.*;
import static org.junit.Assert.*;

public class DoublyTest {
	
	HospitalManager mgr = new HospitalManager();
	
	@Test
	public void testsPatientListLengthEmpty() {
		int expected = 0;
		int output = mgr.patientListLength();
		assertEquals(expected, output);
	}
	
	@Test
	public void testsEmptyPrintForwardList() {
		String expected = "No Records to Print!";
		String output = mgr.printRecordsForwards();
		assertEquals(expected, output);
	}
	
	@Test
	public void testsDeleteFrommEmptyList() {
		boolean output = mgr.deletePatient("a");
		assertFalse(output);
	}
	
	@Test
	public void testsEmptyPrintBackwardList() {
		String expected = "No Records to Print!";
		String output = mgr.printRecordsBackwards();
		assertEquals(expected, output);		
	}
	
	@Test
	public void testsAddAndPrintForward() {
		mgr.addPatient(new Patient("Ian", 32, "cold"));
		mgr.addPatient(new Patient("Sam", 30, "TB"));
		mgr.addPatient(new Patient("Mark", 28, "chicken pox"));
		String expected = "Ian Sam Mark ";
		String output = mgr.printRecordsForwards();
		assertEquals(expected, output);
	}
	
	@Test
	public void testsAddAndPrintBackward() {
		mgr.addPatient(new Patient("Ian", 32, "cold"));
		mgr.addPatient(new Patient("Sam", 30, "TB"));
		mgr.addPatient(new Patient("Mark", 28, "chicken pox"));
		String expected = "Mark Sam Ian ";
		String output = mgr.printRecordsBackwards();
		assertEquals(expected, output);		
	}
	
	@Test
	public void testsRemoveFirstAndPrintForward() {
		mgr.addPatient(new Patient("Ian", 32, "cold"));
		mgr.addPatient(new Patient("Sam", 30, "TB"));
		mgr.addPatient(new Patient("Mark", 28, "chicken pox"));
		mgr.deletePatient("Ian");
		String expected = "Sam Mark ";
		String output = mgr.printRecordsForwards();
		assertEquals(expected, output);	
	}
	
	@Test
	public void testsRemoveLastAndPrintForward() {
		mgr.addPatient(new Patient("Ian", 32, "cold"));
		mgr.addPatient(new Patient("Sam", 30, "TB"));
		mgr.addPatient(new Patient("Mark", 28, "chicken pox"));
		mgr.deletePatient("Mark");
		String expected = "Ian Sam ";
		String output = mgr.printRecordsForwards();
		assertEquals(expected, output);	
	}
	
	@Test
	public void testsPatientListLength() {
		mgr.addPatient(new Patient("Ian", 32, "cold"));
		mgr.addPatient(new Patient("Sam", 30, "TB"));
		mgr.addPatient(new Patient("Mark", 28, "chicken pox"));
		int expected = 3;
		int output = mgr.patientListLength();
		assertEquals(expected, output);	
	}
	
}