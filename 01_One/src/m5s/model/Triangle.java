package m5s.model;

import m5s.Shape;

public class Triangle implements Shape{
	
	public double flank1;
	public double flank2;
	public double flank2b = flank1+flank2;
	public double flank3;
	public double ground;
	public double height;

	@Override
	public double calculateArea(double ground, double height) {
		return ((ground*height)/2);
	}

	@Override
	public double calculateShape(double flank2b, double flank3) {
		
		return (flank2+flank3);
	}

}
