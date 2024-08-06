package arraylist;

public class ListApp {

	public static void main(String[] args) {
		
		ArrayList<String> stringList = new ArrayList<String>(5);
		
		stringList.addItem("Jacob");
		stringList.addItem("Marc");
		stringList.addItem("Ryn");
		stringList.addItem("Ivy");
		stringList.addItem("Shy");
		
		//Square objects
		Square s1 = new Square(5.0);
		Square s2 = new Square(7.5);
		Square s3 = new Square(10);
		Square s4 = new Square(2.5);
		
		ArrayList<Square> squareList = new ArrayList<Square>(4);
		squareList.addItem(s1);
		squareList.addItem(s2);
		squareList.addItem(s3);
		squareList.addItem(s4);
		
		//PointThreeD objects
		PointThreeD p1 = new PointThreeD(10.0,7.5,5.0);
		PointThreeD p2 = new PointThreeD(2.5,5.0,7.5);
		PointThreeD p3 = new PointThreeD(1.5,2.5,3.5);
		PointThreeD p4 = new PointThreeD(2.0,3.0,4.0);
		
		ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>(4);
		pointList.addItem(p1);
		pointList.addItem(p2);
		pointList.addItem(p3);
		pointList.addItem(p4);
		
		System.out.println(stringList.toString());
		
		System.out.println(squareList.toString());
		
		System.out.println(pointList.toString());
	}//end main

}//end class
