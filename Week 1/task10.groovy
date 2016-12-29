//outputs whether a sequence of numbers are consecutive regardless of increasing or decreasing
println "Enter an arbitrarily long sequence of numbers ending in -1"
String num_consec = ""
boolean finished = false
String str2 = System.console().readLine()
int start_num = Integer.parseInt(str2)
int prev_num = start_num 
while (!finished) {
	String str = System.console().readLine()
	int num = Integer.parseInt(str)
	if (num == -1) {
		finished = true
	} else if ((num - prev_num == 1 || num - prev_num == -1) && num_consec != "no") {
		num_consec = "yes"
		prev_num = num
	} else {
		num_consec = "no"
	} 
}
println "Were the numbers consecutive? " + num_consec
