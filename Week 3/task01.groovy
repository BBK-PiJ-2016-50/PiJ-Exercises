//this program compares d1 and d2 outputs whether they are equal or not
//it will always print equal because of rounding errors with floating point numbers
//the code can be fixed by replacing (d1 == d2) with (Math.abs(d1 - d2) < 10E-6)

double d1 = 1.255
double d2 = d1 + 7 - 4 - 3
if (Math.abs(d1 - d2) < 10E-6) {
	println("1.255 is equal to 1.255 plus 7 minus 7");
} else {
	println("1.255 is NOT equal to 1.255 plus 7 minus 7");
}