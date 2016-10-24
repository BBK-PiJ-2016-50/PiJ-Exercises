//read text and create palindrome
print "Enter some text to create a palindrome: "
String sentence = System.console().readLine()
String reversedText = ""

for (count=sentence.length()-1; count>=0; count--) {
	String currentLetter = sentence.substring(count, count+1)
	reversedText = reversedText + currentLetter
}

println sentence + reversedText