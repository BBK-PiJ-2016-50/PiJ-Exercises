//code prints a number pyramid from 1 to 9
int counter = 1
String numbers = ""

while (counter < 10) {
	int internalcounter = 0
	while (internalcounter < counter){
		numbers = numbers + counter
		internalcounter++
	}
	println numbers
	counter++
	numbers = ""
}