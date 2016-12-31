class Point {
	double x;
	double y;
}

//create coordinates for point 1
print "Enter first point coordinate x: "
String str1x = System.console().readLine()
print "Enter first point coordinate y: "
String str1y = System.console().readLine()
Point point1 = new Point()
point1.x = Double.parseDouble(str1x)
point1.y = Double.parseDouble(str1y)

//create coordinates for point 2
print "Enter second point coordinate x: "
String str2x = System.console().readLine()
print "Enter second point coordinate y: "
String str2y = System.console().readLine()
Point point2 = new Point()
point2.x = Double.parseDouble(str2x)
point2.y = Double.parseDouble(str2y)

//create coordinates for point 3
print "Enter third point coordinate x: "
String str3x = System.console().readLine()
print "Enter third point coordinate y: "
String str3y = System.console().readLine()
Point point3 = new Point()
point3.x = Double.parseDouble(str3x)
point3.y = Double.parseDouble(str3y)

//determine which two points are closest and print result on screen
double dist1and2 = Math.sqrt(((point1.x - point1.y)**2) + ((point2.x - point2.y)**2))
double dist1and3 = Math.sqrt(((point1.x - point1.y)**2) + ((point3.x - point3.y)**2))
double dist2and3 = Math.sqrt(((point2.x - point2.y)**2) + ((point3.x - point3.y)**2))

if ((dist1and2 < dist1and3) && (dist1and2 < dist2and3)) {
	println "The two closest points are Point 1 and Point 2"
} else if (dist1and3 < dist2and3) {
	println "The two closest points are Point 1 and Point 3"
} else {
	println "The two closest points are Point 2 and Point 3"
}
