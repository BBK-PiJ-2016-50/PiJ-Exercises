class Rectangle {
	Point upLeft;
	Point downRight;
}

class Point {
	double x;
	double y;
}

//create rectangles
Rectangle rectangleA = new Rectangle()
rectangleA.upLeft = new Point()
rectangleA.downRight = new Point()

Rectangle rectangleB = new Rectangle()
rectangleB.upLeft = new Point()
rectangleB.downRight = new Point()

//create x and y coordinates for rectangle A upLeft point
println "Determine if a point falls within any of the two rectangles."
print "Enter the X coordinate for rectangle A upLeft point: "
String str1x = System.console().readLine()
rectangleA.upLeft.x = Double.parseDouble(str1x)
print "Enter the Y coordinate for rectangle A upLeft point: "
String str1y = System.console().readLine()
rectangleA.upLeft.y = Double.parseDouble(str1y)

//create x and y coordinates for rectangle A downRight point
print "Enter the X coordinate for rectangle A downRight point: "
String str2x = System.console().readLine()
rectangleA.downRight.x = Double.parseDouble(str2x)
print "Enter the Y coordinate for rectangle A downRight point: "
String str2y = System.console().readLine()
rectangleA.downRight.y = Double.parseDouble(str2y)

//create x and y coordinates for rectangle B upLeft point
print "Enter the X coordinate for rectangle B upLeft point: "
String str3x = System.console().readLine()
rectangleB.upLeft.x = Double.parseDouble(str3x)
print "Enter the Y coordinate for rectangle B upLeft point: "
String str3y = System.console().readLine()
rectangleB.upLeft.y = Double.parseDouble(str3y)

//create x and y coordinates for rectangle B downRight point
print "Enter the X coordinate for rectangle B downRight point: "
String str4x = System.console().readLine()
rectangleB.downRight.x = Double.parseDouble(str4x)
print "Enter the Y coordinate for rectangle B downRight point: "
String str4y = System.console().readLine()
rectangleB.downRight.y = Double.parseDouble(str4y)

//create x and y coordinates for fifth point
print "Enter the X coordinate for the fifth point: "
String str5x = System.console().readLine()
double point5x = Double.parseDouble(str5x)
print "Enter the Y coordinate for the fifth point: "
String str5y = System.console().readLine()
double point5y = Double.parseDouble(str5y)

//determine if third point falls outside or inside rectangle(s)
//on the line is interpreted as being within the rectangle
boolean withinAx = false
boolean withinAy = false
boolean withinBx = false
boolean withinBy = false

if (point5x >= rectangleA.upLeft.x && point5x <= rectangleA.downRight.x) {
	withinAx = true
}
if (point5y <= rectangleA.upLeft.y && point5y >= rectangleA.downRight.y) {
	withinAy = true
}
if (point5x >= rectangleB.upLeft.x && point5x <= rectangleB.downRight.x) {
	withinBx = true
}
if (point5y <= rectangleB.upLeft.y && point5y >= rectangleB.downRight.y) {
	withinBy = true
}

if (withinAx && withinAy && withinBx && withinBy) {
	println "The fifth point is within both rectangles"
} else if (withinAx && withinAy) {
	println "The fifth point is within rectangle A only"
} else if (withinBx && withinBy) {
	println "The fifth point is within rectangle B only"
} else {
	println "The fifth point is outside both rectangles"
}
