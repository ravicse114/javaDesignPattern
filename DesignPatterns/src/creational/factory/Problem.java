package creational.factory;

class Point {
	
	private double x,y;
	
	private Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public static Point newCartesianPoint(double x, double y) {
		return new Point(x,y);
	}
	
	public static Point newPolarPoint(double rho, double theta) {
		return new Point(rho*Math.cos(theta),
				rho*Math.sin(theta));
	}
	
	public String toString() {
		return "X coordinate is : "+x+" and y coordinate is : "+y;
	}
}

public class Problem {
	public static void main(String[] args) {
		Point p1 = Point.newCartesianPoint(2, 3);
		Point p2 = Point.newPolarPoint(10, 20);
		System.out.println("Cartesian point is :: "+p1);
		System.out.println("Polar point is :: "+p2);
	}
}