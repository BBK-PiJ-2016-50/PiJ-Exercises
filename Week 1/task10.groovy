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
	} else if ((num - prev_num == 1 || num - prev_num == -1) && num_increase != "no") {
		num_increase = "yes"
		prev_num = num
		println "yes"
	} else {
		num_increase = "no"
		println "no"
	} 
}
println "Did numbers increase: " + num_increase
