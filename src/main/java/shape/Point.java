package shape;

public class Point {
	private double xpos;
	private double ypos;
	
	public void setXpos(double xpos) {
		this.xpos = xpos;
	}
	public void setYpos(double ypos) {
		this.ypos = ypos;
	}
	
	@Override
	public String toString() {
		return "Point [x좌표=" + xpos + ", y좌표=" + ypos + "]";
	}
	
	
	
}
