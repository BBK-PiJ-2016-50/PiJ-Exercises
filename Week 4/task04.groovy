print "Enter a decimal or a hexidecimal number: "
String num = System.console().readLine()

if (num.substring(0,2) == '0x') {
	println num + " is a hexadecimal number.  It's decimal equivalent is: " + hexadecimal2decimal(num)
} else {
	println num + " is a decimal number.  It's hexadecimal equivalent is: " + decimal2hexadecimal(num)
}

//convert hex to decimal
int hexadecimal2decimal(String hex) {
	String bin = ""
	String hexNoPrefix = hex.substring(2)
	for (int c=0; c < hexNoPrefix.length(); c++) {
		String curChar = hexNoPrefix.charAt(c)
		int num;
		if (curChar == 'a') {
			num = 10
		} else if (curChar == 'b') {
			num = 11
		} else if (curChar == 'c') {
			num = 12
		} else if (curChar == 'd') {
			num = 13
		} else if (curChar == 'e') {
			num = 14
		} else if (curChar == 'f') {
			num = 15
		} else {
			num = Integer.parseInt(curChar)
		}
		
		//ensure each dec number represented by 4 bits
		String curBin = decimal2binary(num)
		while (curBin.length() != 4) {
			curBin = '0' + curBin
		}	
		bin += curBin
	}
	return binary2decimal(bin)
}

//convert decimal to hex
String decimal2hexadecimal(String dec) {
	int decimal = Integer.parseInt(dec)
	//ensure binary number represented by 32 bits
	String bin = decimal2binary(decimal)
	while (bin.length() != 32) {
		bin = '0' + bin
	}	
	String hex = "0x"
	for (int c=0; c < bin.length(); c+=4) {
		String cur4Bits = bin.substring(c, c+4)
		int binConvert = binary2decimal(cur4Bits)
		if (binConvert == 10) {
			hex += 'a'
		} else if (binConvert == 11) {
			hex += 'b'
		} else if (binConvert == 12) {
			hex += 'c'
		} else if (binConvert == 13) {
			hex += 'd'
		} else if (binConvert == 14) {
			hex += 'e'
		} else if (binConvert == 15) {
			hex += 'f'
		} else {
			hex += ("" + binConvert)
		}
	}
	return hex
}


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

//takes decimal number and returns corresponding binary
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