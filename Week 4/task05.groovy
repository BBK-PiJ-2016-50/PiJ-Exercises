class Point {
	double x;
	double y;
	
	//calculates the distance to another point
	double distanceTo(Point point) {
		this.x = x
		this.y = y
		return Math.sqrt(((this.x - this.y)**2) + ((point.x - point.y)**2))
	}
	
	//calculates the distance to the origin. Implement it by calling the first method
	double distanceToOrigin() {
		Point origin = new Point()
		origin.x = 0
		origin.y = 0
		return distanceTo(origin)
	}
	
	//changes the coordinates of this point to be the given parameters x and y
	void moveTo(double x, double y){
		this.x = x
		this.y = y
	}
	
	//changes the coordinates of this point to move where the given point is
	void moveTo(Point point) {
		this.x = point.x
		this.y = point.y
	}
	
	//returns a copy of the current point with the same coordinates
	Point clone() {
		Point clone = new Point()
		clone.x = this.x
		clone.y = this.y
		return clone
	}
	
	returns a copy of the current point with the coordinates multiplied by −1
	Point opposite() {
		Point opp = clone()
		opp.x = opp.x * -1
		opp.y = opp.y * -1
		return opp
	}
}