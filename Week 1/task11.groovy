println "Enter 5 cards (rank and suit) and see what you got!"

int cardCounter = 1
String card1rank = 0
String card1suit = ""
String card2rank = 0
String card2suit = ""
String card3rank = 0
String card3suit = ""
String card4rank = 0
String card4suit = ""
String card5rank = 0
String card5suit = ""

//get rank and suit for 5 cards
while (cardCounter <= 5) {
	//get card rank
	boolean correctRank = false
	while (!correctRank) {
		print "Enter card " + cardCounter + " rank: "
		String rank = System.console().readLine()
		if (rank == 'A' || rank == '2' || rank == '3' || rank == '4' || rank == '5' || rank == '6' || rank == '7' || rank == '8' || rank == '9' || rank == '10' || rank == 'J' || rank == 'Q' || rank == 'K') {
			//convert lettered ranks to numbers for easier validation of hand
			if (rank == 'A') {
				rank = '1'
			} else if (rank == 'J') {
				rank = '11'
			} else if (rank == 'Q') {
				rank = '12'
			} else if (rank == 'K') {
				rank = '13'
			}
			
			//assign rank to correct card number
			if (cardCounter == 1) {
				card1rank = Integer.parseInt(rank)
			} else if (cardCounter == 2) {
				card2rank = Integer.parseInt(rank)
			} else if (cardCounter == 3) {
				card3rank = Integer.parseInt(rank)
			} else if (cardCounter == 4) {
				card4rank = Integer.parseInt(rank)
			} else {
				card5rank = Integer.parseInt(rank)
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
				card1suit = card1suit + suit
			} else if (cardCounter == 2) {
				card2suit = card2suit + suit
			} else if (cardCounter == 3) {
				card3suit = card3suit + suit
			} else if (cardCounter == 4) {
				card4suit = card4suit + suit
			} else {
				card5suit = card5suit + suit
			}
			correctSuit = true
		} else {
			println "Not a correct suit.  Try again..."
		}
	}
	cardCounter++
}

//check for same suit required in straight flush and flush
boolean sameSuit = false
if (card1suit == card2suit && card1suit == card3suit && card1suit == card4suit && card1suit == card5suit) {
	sameSuit = true
}

//check for 4 cards
def rankList = [card1rank, card2rank, card3rank, card4rank, card5rank]
boolean rankCountFour = false
if (rankList.count{it == card1rank} == 4 || rankList.count{it == card2rank} == 4) {
	rankCountFour = true
}

//check for same rank - 2 cards
boolean rankCountTwo
if (rankList.count{it == card1rank} == 2 || rankList.count{it == card2rank} == 2 || rankList.count{it == card3rank} == 2 || rankList.count{it == card4rank} == 2) {
	rankCountTwo = true
}

//check for same full house
//check for two pair

//check for consectutive cards

//check hands
//check for straight flush - same suit and consecutive ranks
//check for poker - 4 of 5 card have same rank
//check for full house - 3 of a kind and 2 of a kind
//check for flush - all same suit, not consecutive
//check for straight - consecutive rank but not same suit
//check for three of a kind - 3 cards have same rank
//check for two pairs - see pair
//check for a pair - two of the cards have the same rank
//else nothing