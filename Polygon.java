package training.three;
import java.util.*;
import java.math.*;

interface Polygon{
	void circle();
	void rectangle();
	void triangle();
	void square();
	void hexagon();
}

class PolygonInterface implements Polygon {
	
	Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		
		
		PolygonInterface pi=new PolygonInterface();
		pi.circle();
		pi.rectangle();
		pi.triangle();
		pi.square();
		pi.hexagon();

	}

	public void circle() {
		
		
		System.out.println("Enter circle radius");
		int radius=scanner.nextInt();
		
		System.out.println("Area of circle:"+Math.PI*radius*radius);
		
	}

	
	public void rectangle() {
		
		
		System.out.println("Enter rectangle length");
		int length=scanner.nextInt();
		
		System.out.println("Enter rectangle breadth");
		int breadth=scanner.nextInt();
		
		System.out.println("Area of rectangle:"+length*breadth);
		
		
	}

	
	public void triangle() {
		 
		
		System.out.println("Enter triangle base");
		int b=scanner.nextInt();
		
		System.out.println("Enter triangle height");
		int h=scanner.nextInt();
		
		System.out.println("Area of triangle:"+0.5*b*h);
		
	}

	
	public void square() {
		
		
		System.out.println("Enter side of square");
		int a=scanner.nextInt();
		
		System.out.println("Area of square:"+a*a);
		
	}

	
	public void hexagon() {
		
		
		System.out.println("Enter side of heaxgon");
		int a=scanner.nextInt();
		
		System.out.println("Area of hexagon:"+(3*Math.sqrt(3)*a*a)/2);
		
	}

}