class Point {
	double x;
	double y;
	
	double distanceTo(Point point) {
		this.x = x
		this.y = y
		return Math.sqrt(((this.x - this.y)**2) + ((point.x - point.y)**2))
	}
	
	double distanceToOrigin() {
		Point origin = new Point()
		origin.x = 0
		origin.y = 0
		return distanceTo(origin)
	}
	
	void moveTo(double x, double y){
		this.x = x
		this.y = y
	}
	
	void moveTo(Point point) {
		this.x = point.x
		this.y = point.y
	}
	
	Point clone() {
		Point clone = new Point()
		clone.x = this.x
		clone.y = this.y
		return clone
	}
	
	Point opposite() {
		Point opp = clone()
		opp.x = opp.x * -1
		opp.y = opp.y * -1
		return opp
	}
}