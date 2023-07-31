package entities;

public class Calculator {
	public double width;
	public double height;
	
	public double area() {
		double area = width * height;
		return area;
	}
	
	public double perimeter() {
		return (width + height)*2;
	}
	
	public double diagonal() {
		double diagonal = Math.pow(width, 2) + Math.pow(height, 2);
		double diagonal2 = Math.sqrt(diagonal);
		return diagonal2;
	}
}
