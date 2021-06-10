package shape;

public class Circle {
	private double radius;
	private Point point;
	
	public Circle(double radius, Point point) {
		super();
		this.radius = radius;
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", point=" + point + ", 넓이" + 3.14*radius*radius +"]";
	}

}
