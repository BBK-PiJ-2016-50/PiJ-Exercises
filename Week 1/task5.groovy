println "Enter two numbers to find the product"
print "Enter the first number: "
String str = System.console().readLine()
int numA = Integer.parseInt(str)
print "Enter the second number: "
String str2 = System.console().readLine()
int numB = Integer.parseInt(str2)
int counter = 0
int product = 0

while (counter < numB) {
	product = product + numA
	counter = counter + 1
}
println "the product is: " + product
