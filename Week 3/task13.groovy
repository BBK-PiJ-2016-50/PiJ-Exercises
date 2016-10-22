print "Enter some text and see if its a palindrome: "
String pal = System.console().readLine()
String reversedText = ""

for (count=pal.length()-1; count>=0; count--) {
	String currentLetter = pal.substring(count, count+1)
	reversedText = reversedText + currentLetter
}
if (reversedText == pal) {
	println "This sentence is a palindrome"
} else {
	println "This sentence is not a palindrome"
}