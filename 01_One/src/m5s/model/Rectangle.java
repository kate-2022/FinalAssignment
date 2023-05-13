package m5s.model;

import m5s.Shape;
import java.lang.Math;


public class Rectangle implements Shape {
	
	public double side1;
	public double side2;

	@Override
	public double calculateArea(double side1, double side2) {
		return (side1*side2);
	}

	@Override
	public double calculateShape(double side1, double side2) {
		return (2*side1 + 2*side2);
	}

}
