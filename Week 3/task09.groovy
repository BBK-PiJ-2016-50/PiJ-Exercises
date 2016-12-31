//solution for counting letter provided by user
print "Enter some text: "
String sentence = System.console().readLine()
print "Enter a letter to count: "
String letter = System.console().readLine()
int letterCount = 0
for (count=0; count < sentence.length(); count++) {
	String currentLetter = sentence.substring(count, count + 1)
	if (currentLetter == letter) {
		letterCount++
	}
}
println "There are " + letterCount + " " + letter + "'s in this sentence"

//solution for counting e's in sentence
//print "Enter some text: "
//String str = System.console().readLine()
//int letterE = 0
//for (count=0; count < str.length(); count++) {
//	String currentLetter = str.substring(count, count + 1)
//	if (currentLetter == 'e') {
//		letterE ++
//	}
//}
//println "There are " + letterE + " e's in this sentence"