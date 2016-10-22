println "Enter three numbers for sorting from lowest to highest"
print "Enter the first number: "
String str = System.console().readLine()
int num1 = Integer.parseInt(str)
print "Enter the second number: "
String str2 = System.console().readLine()
int num2 = Integer.parseInt(str2)
print "Enter the third number: "
String str3 = System.console().readLine()
int num3 = Integer.parseInt(str3)

int max = 0
int med = 0
int min = 0

if (num1 > num2 && num1 > num3) {
	max = num1
	if (num2 > num3) {
		med = num2
		min = num3
	} else {
		med = num3
		min = num2
	}
} else if (num2 > num1 && num2 > num3) {
	max = num2
	if (num1 > num3) {
		med = num1
		min = num3
	} else {
		med = num3
		min = num1
	}
} else {
	max = num3
	if (num1 > num2) {
		med = num1
		min = num2
	} else {
		med = num2
		min = num1
	}
}
println "The numbers in sequence: " + min + ", " + med + ", " + max