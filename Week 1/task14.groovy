//first 1000 primes
int totalPrimes = 0
int currentNumber = 2
while (totalPrimes < 1000) {
	int counter = 2
	boolean isPrime = true
	while (counter < currentNumber) {
		if (currentNumber % counter == 0) {
			isPrime = false
			break;
		} else {
			counter++
		}
	}
	if (isPrime) {
		println currentNumber
		totalPrimes++
		
	}	
	currentNumber++
}