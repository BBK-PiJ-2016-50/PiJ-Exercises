int player1Score = 0
int player2Score = 0
boolean finished = false

while (!finished) {
	print "Enter the combination: "
	String str = System.console().readLine()
	String player1 = str.substring(0, 1)
	String player2 = str.substring(1)
	if (player1 == player2) {
		println "Draw, no score"
	} else if (player1 == 'P' && player2 == 'R') {
		player1Score++
		println "player 1 wins this hand"
	} else if (player1 == 'R' && player2 == 'S') {
		player1Score++
		println "player 1 wins this hand"
	} else if (player1 == 'S' && player2 == 'P') {
		player1Score++
		println "player 1 wins this hand"
	} else if (player2 == 'P' && player1 == 'R') {
		player2Score++
		println "player 2 wins this hand"
	} else if (player2 == 'R' && player1 == 'S') {
		player2Score++
		println "player 2 wins this hand"
	} else if (player2 == 'S' && player1 == 'P') {
		player2Score++
		println "player 2 wins this hand"
	}

	if (player1Score - player2Score == 4) {
		println "Player 1 wins!"
		finished = true
	} else if (player2Score - player1Score == 4) {
		println "Player 2 wins!"
		finished = true
	}
	
}
