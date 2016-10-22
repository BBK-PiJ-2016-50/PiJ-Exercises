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
println "Fine the perimeter and area of a rectangle based on four coordinate points."
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

//calculate rectangle width and height
double width = rectangle.downRight.x - rectangle.upLeft.x
double height = rectangle.upLeft.y - rectangle.downRight.y

//calculate perimeter and area
double perimeter = (width + height) * 2
double area = width * height

println "Perimeter is: " + perimeter
println "Area is: " + area
