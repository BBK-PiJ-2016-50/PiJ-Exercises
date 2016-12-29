//ask user for number n
//calculates the partial addition of n terms of this infinite sum
//how many terms required to get first 3 digits correct (3.14)
//how many terms required to get first 10 digits correct (3.14159265358)

print "Enter a number: "
String str = System.console().readLine()
int num = Integer.parseInt(str)

int counter = 0
int divisor = 1
double total = 0
boolean plusSign = true

//switches between + and - calculations for each ieration of the loop
while (counter < num) {
	if (plusSign) {
		double calc = 4 / divisor
		total += calc
		divisor += 2
		plusSign = false
		counter++
	} else {
		double calc = 4 / divisor
		total -= calc
		divisor += 2
		plusSign = true
		counter++
	}
}

println "The output is: " + total

//623 to get it to output correctly to 3 digits
//1000000  to get 6 digits
