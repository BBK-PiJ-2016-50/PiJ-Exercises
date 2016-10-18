println "Displays all prime numbers up to 1000:"
int globalCount = 2
while (globalCount <= 1000) {
	int counter = 2
	boolean isPrime = true
	while (counter < globalCount) {
		if (globalCount % counter == 0) {
			isPrime = false
			break;
		} else {
			counter++
		}
	}
	if (isPrime) {
		println globalCount
	}	
	globalCount++
}