print "Enter a number to see if it is a prime: "
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
	println num + " is a prime"
} else {
	println num + " is not a prime"
}

