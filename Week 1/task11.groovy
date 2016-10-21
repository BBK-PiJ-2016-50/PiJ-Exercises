//tell user what is best hand based on those cards
//8 types of hand to check

println "Enter 5 cards (rank and suit) and see what you got!"

int cardCounter = 1
String card1 = ""
String card2 = ""
String card3 = ""
String card4 = ""
String card5 = ""

//get rank and suit for 5 cards
while (cardCounter <= 5) {
	//get card rank
	boolean correctRank = false
	while (!correctRank) {
		print "Enter card " + cardCounter + " rank: "
		String rank = System.console().readLine()
		if (rank == 'A' || rank == '2' || rank == '3' || rank == '4' || rank == '5' || rank == '6' || rank == '7' || rank == '8' || rank == '9' || rank == '10' || rank == 'J' || rank == 'Q' || rank == 'K') {
			if (cardCounter == 1) {
				card1 = card1 + rank
			} else if (cardCounter == 2) {
				card2 = card2 + rank
			} else if (cardCounter == 3) {
				card3 = card3 + rank
			} else if (cardCounter == 4) {
				card4 = card4 + rank
			} else {
				card5 = card5 + rank
			}
			correctRank = true
		} else {
			println "Not a correct rank.  Try again..."
		}
	}

	//get card suit
	boolean correctSuit = false
	while (!correctSuit) {
		print "Enter card " + cardCounter + " suit: "
		String suit = System.console().readLine()
		if (suit == 'H' || suit == 'D' || suit == 'C' || suit == 'S') {
			if (cardCounter == 1) {
				card1 = card1 + suit
			} else if (cardCounter == 2) {
				card2 = card2 + suit
			} else if (cardCounter == 3) {
				card3 = card3 + suit
			} else if (cardCounter == 4) {
				card4 = card4 + suit
			} else {
				card5 = card5 + suit
			}
			correctSuit = true
		} else {
			println "Not a correct suit.  Try again..."
		}
	}
	cardCounter++
}

print card1 + " " + card2 + " " + card3 + " " + card4 + " " + card5