println "Enter an arbitrarily long sequence of numbers ending in -1: "
int max = 0
boolean finished = false
while (!finished) {
	String str = System.console().readLine()
	int num = Integer.parseInt(str)
	if (num > max) {
		max = num
	} else if (num == -1) {
		finished = true
	}
}
println "The largest number in the sequence: " + max
