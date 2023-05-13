package m5s.model;

import m5s.Shape;

public class Circle implements Shape{
	
	public double radius;
	public static final double PI= 3.14;
	public double circumference;
	public double area;
	
	@Override
	public double calculateArea(double PI, double radius) {
	return (area = PI*radius*radius);
	}
	
	@Override
	public double calculateShape(double PI, double radius) {	
		return (circumference=2*PI*radius);
	}

}
