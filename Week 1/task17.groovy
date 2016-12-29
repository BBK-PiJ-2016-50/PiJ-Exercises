//finds the closest prime number to an integer entered by the user
print "Enter a number to find its closest prime number: "
String str = System.console().readLine()
int num = Integer.parseInt(str)
int closestPrimeBelow = 0
int closestPrimeAbove = 0
boolean finished = false
int currentNum = num

//looks for closest prime below the number
while (!finished) {
	//go down from number
	int counter = 2
	boolean isPrime = true
	while (counter < currentNum) {
		if (currentNum % counter == 0) {
			isPrime = false
			break;
		} else {
			counter++
		}
	}
	if (isPrime) {
		closestPrimeBelow = currentNum
		finished = true
	} else {
		currentNum--
	}
}

finished = false
currentNum = num

//checks if the number entered by the user is a prime number
if (closestPrimeBelow == num) {
	println num + " is a prime number"
//looks for closest prime number above the number entered by the user
} else {
	while (!finished) {
		//go up from number
		int counter = 2
		boolean isPrime = true
		while (counter < currentNum) {
			if (currentNum % counter == 0) {
				isPrime = false
				break;
			} else {
				counter++
			}
		}
		if (isPrime) {
			closestPrimeAbove = currentNum
			finished = true
		} else {
			currentNum++
		}
	}
	//outputs the closest prime number(s)
	if ((num - closestPrimeBelow) < (closestPrimeAbove - num)) {
		println "The closest prime number to " + num + "  is " + closestPrimeBelow
	} else if ((num - closestPrimeBelow) > (closestPrimeAbove - num)) {
		println "The closest prime number to " + num + " is " + closestPrimeAbove
	} else {
		println "The closest prime number to " + num + " is both " + closestPrimeBelow + " and " + closestPrimeAbove
	}
}


