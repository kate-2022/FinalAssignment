package m5s;

import m5s.model.Circle;
import m5s.model.Rectangle;
import m5s.model.Triangle;

public class main {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		Rectangle rectangle = new Rectangle();
		
		System.out.println("circle area: "+circle.calculateShape(3.14, 1.0 ));
		System.out.println("circle shape: "+circle.calculateShape(3.14, 1.0));
		
		System.out.println("triangle area: "+triangle.calculateArea(3.0, 1.2));
		System.out.println("triangle shape: "+triangle.calculateShape(3.5, 2));
	
		System.out.println("rectangle area: "+rectangle.calculateArea(5, 2));
		System.out.println("rectangle shape: "+rectangle.calculateShape(5, 2));

	}

}
