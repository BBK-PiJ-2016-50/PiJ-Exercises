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

boolean sameSuit = false
boolean consecutive = false
boolean fourSameRank = false
boolean threeSameRank = false
boolean fullHouse = false
boolean twoPair = false
boolean pair = false

//check for same suit
if (card1suit == card2suit && card1suit == card3suit && card1suit == card4suit && card1suit == card5suit) {
	sameSuit = true
}

//check for pair
if (card1rank == card2rank || card1rank == card3rank || card1rank == card4rank || card1rank == card5rank || 
	card2rank == card3rank || card2rank == card4rank || card2rank == card5rank || card3rank == card4rank || 
	card3rank == card5rank || card4rank == card5rank) {
	pair = true
}

//check for two pair
if ((card1rank == card2rank || card1rank == card3rank || card1rank == card4rank || card1rank == card5rank) && 
	(card2rank == card3rank || card2rank == card4rank || card2rank == card5rank || card3rank == card4rank || 
	card3rank == card5rank || card4rank == card5rank)) {
	twoPair = true
} else if ((card2rank == card3rank || card2rank == card4rank || card2rank == card5rank) && (card3rank == card4rank || 
	card3rank == card5rank || card4rank == card5rank)) {
	twoPair true
} else if ((card3rank == card4rank || card3rank == card5rank) && (card4rank == card5rank)) {
	twoPair true
}

//check for 3 of a kind
if ((card1rank == card2rank && card1rank == card3rank) || (card1rank == card2rank && card1rank == card4rank) || 
	(card1rank == card3rank && card1rank == card5rank) || (card1rank == card3rank && card1rank == card4rank) ||
	(card1rank == card3rank && card1rank == card5rank) || (card1rank == card4rank && card1rank == card5rank) ||
	(card2rank == card3rank && card2rank == card4rank) || (card2rank == card3rank && card2rank == card5rank) || 
	(card2rank == card4rank && card2rank == card5rank) || (card3rank == card4rank && card3rank == card5rank)) {
	threeSameRank = true
}

//check for 4 of a kind
if ((card1rank == card2rank && card1rank == card3rank && card1rank == card4rank) || (card1rank == card3rank && 
	card1rank == card4rank && card1rank == card5rank)) {
	fourSameRank = true
}

//check for full house
if (((card1rank == card2rank && card1rank == card3rank) && (card4rank == card5rank)) || 
	((card1rank == card2rank && card1rank == card4rank) && (card3rank == card5rank)) || 
	((card1rank == card2rank && card1rank == card5rank) && (card3rank == card4rank)) || 
	((card1rank == card3rank && card1rank == card4rank) && (card2rank == card5rank)) || 
	((card1rank == card3rank && card1rank == card5rank) && (card2rank == card4rank)) || 
	((card1rank == card4rank && card1rank == card5rank) && (card2rank == card3rank)) || 
	((card2rank == card3rank && card2rank == card4rank) && (card1rank == card5rank)) || 
	((card2rank == card3rank && card2rank == card5rank) && (card1rank == card4rank)) || 
	((card2rank == card4rank && card2rank == card5rank) && (card1rank == card3rank)) || 
	((card3rank == card4rank && card3rank == card5rank) && (card1rank == card2rank))) {
	fullHouse = true
}

//check for consecutive cards

println sameSuit
println consecutive
println fourSameRank
println threeSameRank
println fullHouse
println twoPair
println pair

//check for best hand
print "Your best hand is: "
if (sameSuit && consecutive) {
	println "STRAIGHT FLUSH!"
} else if (fourSameRank) {
	println "POKER!"
} else if (fullHouse) {
	println "FULL HOUSE!"
} else if (sameSuit) {
	println "FLUSH!"
} else if (threeSameRank) {
	println "THREE OF A KIND!"
} else if (twoPair) {
	println "TWO PAIRS!"
} else if (pair) {
	println "PAIR!"
} else {
	println "You got nothing!"
}