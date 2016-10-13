String str = System.console().readLine()
int num = Integer.parseInt(str)
int counter = 2
boolean isPrime = true

if (num == 1) {
	isPrime = false
} else {
	while (counter < num) {
		if (num % counter == 0) {
			isPrime = false
			break;
		} else {
			counter++
		}	
	}
}

if (isPrime) {
	println "is a prime"
} else {
	println "is not a prime"
}

