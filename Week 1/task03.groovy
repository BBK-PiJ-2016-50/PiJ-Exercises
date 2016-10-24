//this code reads in a number, and while this number is less than 10, it increments it by 1 and asks for another number
//if this new number is equal to 0 then it ends the loop.  If this new number is not 1 then print it

String str = System.console().readLine()
int i = Integer.parseInt(str)
while (i < 10) {
	i++;
	str = System.console().readLine()
	int j = Integer.parseInt(str)
	if (j == 0) {
		break;
	} else if (j != 1) {
		println j;
	}
}
println "finished"