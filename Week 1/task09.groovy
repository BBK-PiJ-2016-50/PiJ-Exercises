//outputs whether a sequence of numbers were consectutive and increasing
println "Enter an arbitrarily long sequence of numbers ending in -1"
String num_increase = ""
boolean finished = false
String str2 = System.console().readLine()
int start_num = Integer.parseInt(str2)
int prev_num = start_num 
while (!finished) {
	String str = System.console().readLine()
	int num = Integer.parseInt(str)
	if (num == -1) {
		finished = true
	} else if (num - prev_num == 1 && num_increase != "no") {
		num_increase = "yes"
		prev_num = num
	} else {
		num_increase = "no"
	} 
}
println "Were numbers consectutive and increasing? " + num_increase
