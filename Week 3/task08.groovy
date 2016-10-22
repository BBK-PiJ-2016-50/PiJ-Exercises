print "Enter some text: "
String str = System.console().readLine()
for (count=0; count < str.length(); count++) {
	String currentLetter = str.substring(count, count + 1)
	if (currentLetter != " "){
		print currentLetter
	} else {
		println ""
	}
}

//solution for reading one letter per line
//String str = System.console().readLine()
//for (count=0; count < str.length(); count++) {
//	println str.substring(count, count + 1)
//}