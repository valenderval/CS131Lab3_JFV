package arraylist;

public class PointThreeD {

	private double xPoint;
	private double yPoint;
	private double zPoint;
	
	public PointThreeD() {
		this.xPoint = 0;
		this.yPoint = 0;
		this.zPoint = 0;
	}//end empty-argument constructor
	
	public PointThreeD(double x, double y, double z) {
		this.xPoint = x;
		this.yPoint = y;
		this.zPoint = z;
	}//end preferred constructor

	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}//end toString
	
}//end class


