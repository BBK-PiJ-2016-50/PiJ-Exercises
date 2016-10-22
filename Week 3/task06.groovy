class Rectangle {
	Point upLeft;
	Point downRight;
}

class Point {
	double x;
	double y;
}

Rectangle rectangle = new Rectangle()
rectangle.upLeft = new Point()
rectangle.downRight = new Point()

//create x and y coordinates for upLeft point
println "See if a specified point falls within a rectangle."
print "Enter the X coordinate for the upLeft point: "
String str1x = System.console().readLine()
rectangle.upLeft.x = Double.parseDouble(str1x)
print "Enter the Y coordinate for the upLeft point: "
String str1y = System.console().readLine()
rectangle.upLeft.y = Double.parseDouble(str1y)

//create x and y coordinates for downRight point
print "Enter the X coordinate for the downRight point: "
String str2x = System.console().readLine()
rectangle.downRight.x = Double.parseDouble(str2x)
print "Enter the Y coordinate for the downRight point: "
String str2y = System.console().readLine()
rectangle.downRight.y = Double.parseDouble(str2y)

//create x and y coordinates for third point
print "Enter the X coordinate for the third point: "
String str3x = System.console().readLine()
double point3x = Double.parseDouble(str3x)
print "Enter the Y coordinate for the third point: "
String str3y = System.console().readLine()
double point3y = Double.parseDouble(str3y)

//determine if third point falls outside or inside rectangle
//on the line is interpreted as being within the rectangle
boolean withinx = false
boolean withiny = false
if (point3x >= rectangle.upLeft.x && point3x <= rectangle.downRight.x) {
	withinx = true
}
if (point3y <= rectangle.upLeft.y && point3y >= rectangle.downRight.y) {
	withiny = true
}

if (withinx && withiny) {
	println "The third point falls with the rectangle"
} else {
	println "The third point does not fall within the rectangle"
}
