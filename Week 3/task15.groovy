//get text from user
print "Enter some text to see if it is a relaxed palindrome: "
String sentence = System.console().readLine()

String textNoNonChars = ""
String textReversed = ""

//create a String with all non chars
for (c=0; c < sentence.length(); c++) {
	char letter = sentence.charAt(c)
	if (Character.isLetter(letter)){
		textNoNonChars += Character.toLowerCase(letter)
	}
}

//create a new reversed string
for (c=textNoNonChars.length()-1; c>=0; c--) {
	String letter = textNoNonChars.charAt(c)
	textReversed += letter
}

//compare two strings
if (textNoNonChars == textReversed) {
	println "This is a relaxed palindrome"
} else {
	println "This is not a relaxed palindrome"
}