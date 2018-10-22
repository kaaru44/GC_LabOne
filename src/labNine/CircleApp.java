package labNine;
import java.util.*;
public class CircleApp {
	static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		int userCntr = 0;
		greetUser();
		continueAgain("Would you like to test another circle?",userCntr);

	}
	public static void greetUser() {
		//System.out.println("Welcome to the Circle Testing App, Please enter a radius...");
		
		double userInput = Circle.checkInput("Welcome to the Circle Testing App, Please enter a radius...");
		
		Circle myCircle = new Circle(userInput);
		
		
		double circumference = myCircle.getCircumference();
		double area = myCircle.getArea();
		
		
		System.out.println(myCircle.toString());
		
	}
	public static void continueAgain(String prompt, int userCntr)
	{
		
		System.out.println(prompt);
		
		String userInput = scnr.nextLine();
		boolean isValid = false;
		
		do {
			if (userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("YES")) {
				circleTest(prompt,userCntr);
				isValid = true;
			}
			else {
				int finalCntr = runCntr(userCntr);
				System.out.println("Closing app...Circles Built: " + finalCntr);
				scnr.close();
				System.exit(7);
			}
		}while(!isValid);
		
	}
	public static int circleTest(String prompt, int userCntr) {
		userCntr = runCntr(userCntr);
		double userInput = Circle.checkInput("Okay, Please enter a new radius...");
		
		Circle myCircle = new Circle(userInput);
		
		double circumference = myCircle.getCircumference();
		double area = myCircle.getArea();
		
		System.out.println(myCircle.toString());
		
		continueAgain(prompt,userCntr);
		
		return userCntr;
	}
	
	public static int runCntr(int userCntr) {
		userCntr++;
		
		return userCntr;
	}

}
