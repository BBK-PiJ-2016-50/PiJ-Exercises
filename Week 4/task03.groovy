//takes b and e from user and returns b to the power of e
int power(int b, int e) {
	int total = 1
	for (int c=0; c < e; c++) {
		total *= b
	}
	return total
}

//takes e and returns 2 to the power of e
int power2(int e) {
	return power(2, e)
}

//takes binary and returns corresponding decimal number
int binary2decimal(String bin) {
	int decimal = 0
	for (int c=0; c < bin.length(); c++) {
		String curBin = bin.charAt(c)
		int e = bin.length() - c - 1
		if (curBin == '1') {
			decimal += power2(e)
		}
	}
	return decimal
}

//takes decimal numbr and returns corresponding binary
String decimal2binary(int dec){
	String reversedBin = ""
	int running = dec
	while ((running / 2) > 0) {
		int quo = running % 2
		reversedBin += quo
		running = running / 2
	}
	
	String bin = ""
	for (int c=reversedBin.length()-1; c>=0; c--) {
		bin += reversedBin.charAt(c)
	}
	return bin
}

println "Select from one of the following options:"
println "1: Convert binary number to decimal number"
println "2: Convert decimal number to binary number"

String str = System.console().readLine()
int choice = Integer.parseInt(str)

switch (choice) {
	case 1:
		print "Enter the binary number: "
		String binNum = System.console().readLine()
		print binary2decimal(binNum)
		break;
	case 2:
		print "Enter the decimal number: "
		String decNum = System.console().readLine()
		int decNumInt = Integer.parseInt(decNum)
		print decimal2binary(decNumInt)
		break;
	
	default:
		println "Wrong selection.  Try again..."

}
