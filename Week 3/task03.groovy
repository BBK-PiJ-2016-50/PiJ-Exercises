//get text input from user
print "Enter a mathematical operation (4 basic ones) and two operands: "
String input = System.console().readLine()

//find the operation and its position.  Operand values derived from this
String op = ""
int opPos = 0
for (count=0; count < input.length(); count++) {
	String current = input.substring(count, count + 1)
	if (current == "+" || current == "-" || current == "*" || current == "/") {
		op += current
		opPos += count
	}
}

//find the values either side of operator and remove spaces
String oprnd1 = (input.substring(0, opPos)).replace(" ", "")
String oprnd2 = (input.substring(opPos + 1)).replace(" ", "")

//convert operands to doubles
double realOprnd1 = Double.parseDouble(oprnd1)
double realOprnd2 = Double.parseDouble(oprnd2)

//perform the operation
double result = 0
switch (op) {
	case "+":
		result = realOprnd1 + realOprnd2
		break;
	case "-":
		result = realOprnd1 - realOprnd2
		break;
	case "*":
		result = realOprnd1 * realOprnd2
		break;
	case "/":
		result = realOprnd1 / realOprnd2
		break;	
}

println "The result of " + input + " = " + result