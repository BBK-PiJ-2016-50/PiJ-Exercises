//get short phrase and long phrase from user
print "Enter a short phrase: "
String sWord = System.console().readLine()
print "Enter a long phrase and see how many time the short phrase appears in it: "
String lWord = System.console().readLine()

//loop through the long word, if the current letter matches the first letter of short word,
//then enter another loop which matches each of the short word letters to the subsequent long letter words
//if a letter match is found, move to the next and so.  If exact match reported then increment the total
int totalMatches = 0
String firstSLetter = sWord.charAt(0)
for (cl=0; cl < lWord.length(); cl++) {
	String curLLetter = lWord.charAt(cl)
	if (firstSLetter == curLLetter) {
		int cs = 1
		boolean finished = false
		String matchingAttempt = sWord.charAt(0)
		while (!finished && cs < sWord.length()) {
			if (sWord.charAt(cs) == lWord.charAt(cl+cs)){
				matchingAttempt += lWord.charAt(cl+cs)
				cs++
			} else {
				finished = true
			}
		if (matchingAttempt == sWord) {
			totalMatches++
		}
		}
	}
}

println "There were " + totalMatches + " matches"