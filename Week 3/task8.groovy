print "Enter some text: "
String str = System.console().readLine()

for (count=0; count < str.length(); count++) {
	println str.substring(count, count + 1)
}