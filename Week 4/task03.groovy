//menu with 2 options
//1. takes binary number and returns decimal
//2. takes decimal and returns binary

//takes b and e from user and returns b to the power of e
int power(int b, int e) {
	int total = 1
	for (c=0; c < e; c++) {
		total *= b
	}
	return total
}

//takes e and returns 2 to the power of e
int power2(int e) {
	power(2, e)
}


//binary2decimal(String)
//takes binary and returns corresponding decimal number
//must call previous method power2(int) to find the result

//decimal2binary(int)
//takes decimal numbr and returns corresponding binary

print power2(7)