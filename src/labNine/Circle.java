package labNine;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Circle {
	
	private double radius = 0.0;
	private double circumference = 0.0;
	private double area = 0.0;
	static private double d = 0.0;
	
	static Scanner scnr = new Scanner(System.in);
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getCircumference() {
		this.circumference = 2 * ( Math.PI * radius );
		
		return circumference;
	}
	public String getFormattedCircumference() {
		
		return "Circumference: " + circumference;
	}
	public double getArea() {
		this.area = Math.PI  * (radius * radius);
		
		return area;
	}
	public String getFormattedArea() {
		return "Area: " + area;
	}
	public static double checkInput(String prompt) {
		boolean isValid = false;
		
		System.out.println(prompt);
		
		while (isValid == false) {
			try {
				
			d = scnr.nextDouble();
			}
			catch(InputMismatchException ex){
				
				System.out.println("Yo! Enter a number, not a word or special character...");
			}
			
			scnr.nextLine();//Clear
			
			if (d < 1)
				System.out.println("Error-Number must be 1/1.0 or greater.");
			else
				isValid = true;
		}
		return d;
	}
	
	public String toString() {
		return "Circumference: " + String.format("'%.2f'", circumference) + " Area: " + String.format("'%.2f'", area);
		}
}
