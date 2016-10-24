int numberToGuess = Math.abs(1000 * Math.random())
int guesses = 1
boolean guessed = false
println "Try to guess my number!"

while (!guessed) {
	print "Tell me a number: "
	String str = System.console().readLine()
	int currentGuess = Integer.parseInt(str)
	if (currentGuess == numberToGuess) {
		println "CORRECT!"
		guessed = true
	} else if (currentGuess > numberToGuess) {
		println "No! My number is lower"
		guesses++
	} else {
		println "No! My number is higher"
		guesses++
	}
}
println "You needed " + guesses + " guesses."
