import java.util.List;
import java.util.ArrayList;

public class PrimeDivisorList extends ArrayList {
	
	private Integer[] myArray = new Integer[10];
	private int arrayCounter = 0;
	
  public void add(Integer num) {
		
		//check for null num
		if (num == null) {
				throw new NullPointerException();
		}
		
		//work out if number is prime
		int counter = 2;
    boolean isPrime = true;
    if (num == 1) {
	    isPrime = false;
    } else {
	    while (counter < num) {
		    if (num % counter == 0) {
			    isPrime = false;
			    break;
		    } else {
			    counter++;
		    }	
	    }
    }
		
		//check for non prime number
	  if (!isPrime) {
			 throw new IllegalArgumentException();
		 }
		
		//add prime number to array
		myArray[arrayCounter] = num;
		arrayCounter++;
	}
	
	public Integer remove(int index) {
		Integer removedItem = myArray[index];
		for (int i = 0; i < arrayCounter; i++) {
			if (i > index) {
				myArray[i-1] = myArray[i];
			}
		}
		arrayCounter--;
		return removedItem;
	}
	
	@Override
	public String toString() {
		String result = "[ ";
		int currentNum = 0;
		List<Integer> ints = new ArrayList<Integer>();
		for (int i = 0; i < arrayCounter; i++) {
			if (myArray[i] != null && !ints.contains(myArray[i])) {
				ints.add(myArray[i]);
				currentNum = myArray[i];
			}
			if (getNumCount(myArray[i]) == 1) {
				result += myArray[i];
			  result += " * ";
			} else if (!result.contains("" + getNumCount(myArray[i]) + "^" + myArray[i] + " * ")) {
				result += getNumCount(myArray[i]);
				result += "^";
				result += myArray[i];
				result += " * ";
			}
		}
		result = result.substring(0, result.length() - 3);
		result += " = ";
		result += getTotal();
		result += " ]";
		return result;
	}
	
	private Integer getTotal() {
		Integer total = 1;
		for (int i = 0; i < arrayCounter; i++) {
			total *= myArray[i];
		}
		return total;
	}
	
	private int getNumCount(Integer num) {
		int numCount = 0;
		for (int j = 0; j < arrayCounter; j++) {
			if (myArray[j] != null && myArray[j] == num) {
				numCount++;
			}
		}
		return numCount;
	}
	
}