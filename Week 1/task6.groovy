String str = System.console().readLine()
int numA = Integer.parseInt(str)
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
println "quotient: " + quotient
println "remainder: " + remainder
