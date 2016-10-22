//read text and count how many e's there are
print "Enter some text: "
String str = System.console().readLine()
int letterE = 0
for (count = 0; count < str.length(); count++) {
	String currentLetter = str.substring(count, count + 1)
	if (currentLetter == 'e') {
		letterE ++
	}
}
println "There are " + letterE + " e's in this sentence"