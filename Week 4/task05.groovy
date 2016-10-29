class Point {
	double x;
	double y;
	
	double distanceTo(Point point) {
		//calculates the distance to another point.
	}
	
	double distanceToOrigin() {
		//calculates the distance to the origin
		//Implement it by calling the first method.
	}
	
	void moveTo(double x, double y){
		//changes the coordinates of this point to be the given parameters x and y
	}
	
	void moveTo(Point point) {
		//changes the coordinates of this point to move where the given point is
	}
	
	Point clone() {
		//returns a copy of the current point with the same coordinates
	}
	
	Point opposite() {
		//returns a copy of the current point with the coordinates multiplied by −1
	}
}