print "Enter some text: "
String text = System.console().readLine()

String lettersUsed = " "
boolean finished = true
int letterCount = 0

while (finished) {
	print "What letter would you like to count now? "
	String letter = System.console().readLine()
	
	//check for letter being used before
	for (count=0; count <= lettersUsed.length(); count++){
		String checkLetter = lettersUsed.charAt(count)
		if (letter == checkLetter) {
			hasLetterBeenUsed = true
			break

	lettersUsed += letter
	for (count=0; count < text.length(); count++) {
		String currentLetter = text.charAt(count)
		if (currentLetter == letter) {
			letterCount++
		}
	}
	println "There are " + letterCount + " " + letter + "'s in your text"
	letterCount = 0
}

			
//if (lettersUsed.indexOf(letter) == 0) {
//		println "Letter already used.  Exiting..."
//		finished = false
//		break;
//	}