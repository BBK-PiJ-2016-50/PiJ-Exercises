println "Enter two numbers to find the quotient and the remainder"
print "Enter the first number: "
String str = System.console().readLine()
int numA = Integer.parseInt(str)
print "Enter the second number: "
String str2 = System.console().readLine()
int numB = Integer.parseInt(str2)
int quotient = 0
int remainder = 0

int current = 0

while (numA > current) {
	current = current + numB
	quotient = quotient + 1
	if (current > numA) {
		current = current - numB
		quotient = quotient - 1
		remainder = numA - current
		break;
	}
}
println "The quotient is: " + quotient
println "The remainder is: " + remainder
