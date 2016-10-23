print "Enter some text: "
String text = System.console().readLine()

String lettersUsed = " "
boolean finished = false
int letterCount = 0

while (!finished) {
	print "What letter would you like to count now? "
	String letter = System.console().readLine()
	
	//check for letter being used before.  If yes then exit loop
	if (isLetterUsed(letter, lettersUsed)) {
		println "Character has been used before. Exiting program..."
		finished = true
		break
	}
	
	//if char not used before then count its occurrences in the text
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

//method for checking if character used before
boolean isLetterUsed(String letter, String lettersUsed) {
	for (count=0; count < lettersUsed.length(); count++){
		String checkLetter = lettersUsed.charAt(count)
		if (letter == checkLetter) {
			return true
		}
	}
	return false
}