print "Enter first number: "
String str1 = System.console().readLine()
double num1 = Double.parseDouble(str1)
print "Enter second number: "
String str2 = System.console().readLine()
double num2 = Double.parseDouble(str2)

println "Select from one of the following options (type the number): "
println "1.Add\n2.Subtract\n3.Multiply\n4.Divide"

boolean finished = false

while (!finished) {

	String str3 = System.console().readLine()
	int choice = Integer.parseInt(str3)

	switch (choice) {
		case 1: 
			double add = num1 + num2
			println num1 + " + " + num2 + " = " + add
			finished = true
			break;
		case 2:
			double sub = num1 - num2
			println num1 + " - " + num2 + " = " + sub
			finished = true
			break;
		case 3:
			double mul = num1 * num2
			println num1 + " * " + num2 + " = " + mul
			finished = true
			break;
		case 4:
			double div = num1 / num2
			println num1 + " / " + num2 + " = " + div
			finished = true
			break;
		default:
			println "Incorrect selection, try again..."
	}
}