String str = System.console().readLine()
int num = Integer.parseInt(str)
int closestPrimeBelow = 0
int closestPrimeAbove = 0
boolean finished = false
int currentNum = num

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

if (closestPrimeBelow == num) {
	println num + " is a prime number"
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
	if ((num - closestPrimeBelow) < (closestPrimeAbove - num)) {
		println "The closest prime number to " + num + "  is " + closestPrimeBelow
	} else if ((num - closestPrimeBelow) > (closestPrimeAbove - num)) {
		println "The closest prime number to " + num + " is " + closestPrimeAbove
	} else {
		println "The closest prime number to " + num + " is both " + closestPrimeBelow + " and " + closestPrimeAbove
	}
}


