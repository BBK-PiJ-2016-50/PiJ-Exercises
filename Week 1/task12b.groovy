//code prints a number pyramid that is right aligned
print "Enter a number between 1 and 25 to see a number pyramid: "
String str = System.console().readLine()
int num = Integer.parseInt(str)
int counter = 1
String numbers = ""

while (counter < (num + 1)) {
	int internalcounter = 0
	int spaces = num - counter
	String insertSpaces = " " * spaces
	while (internalcounter < counter){
		numbers = numbers + counter
		internalcounter++
	}
	numbers = insertSpaces + numbers
	println numbers
	counter++
	numbers = ""
	
}