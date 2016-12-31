//not completely happy with this solution

print "Enter a number with comma's as decimal dots: "
String str = System.console().readLine()

// remove dot and comma and store dot's place
String pointsRemoved = ""
int decPoints = 0
for (count=0; count < str.length(); count++) {
	String current = str.substring(count, count + 1)
	if (current != "," && current != ".") {
		pointsRemoved = pointsRemoved + current
	}
	if (current == ".") {
		String vals = str.substring(count + 1)
		decPoints = vals.length()
	}
}

//halve the resulting number
int num = Integer.parseInt(pointsRemoved)
int halfNum = num / 2

//add the decimal back into the string at correct num of digits from right
String numNoDec = String.valueOf(halfNum)
String finalNum = ""
for (count=0; count < numNoDec.length(); count++) {
	String current = numNoDec.substring(count, count + 1)
	if ((numNoDec.length() - decPoints) == count) {
		finalNum = finalNum + "." + current
	} else {
		finalNum = finalNum + current
	}
}

println "Half " + str + " is " + finalNum