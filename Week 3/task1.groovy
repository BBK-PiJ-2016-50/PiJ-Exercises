//checks equality of d1 and d2
//d1 is included as part of d2 meaning that it is 1.255 + 7 - 4 -3
//therefore it is not d1 is not equal to d2

double d1 = 1.255
double d2 = d1 + 7 - 4 - 3
if (d1 == d2) {
	println("1.255 is equal to 1.255 plus 7 minus 7");
} else {
	println("1.255 is NOT equal to 1.255 plus 7 minus 7");
}