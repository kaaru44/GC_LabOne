//Created by Carl Jones III.
//10-9-2018
package labTwo;

import java.util.Scanner;

public class MeasureRooms {
	static Scanner scnr = new Scanner(System.in);
	public static void main (String [] args) {
		
		System.out.println("What is the length of the classroom?");
		double roomLength = scnr.nextDouble();
		System.out.println("What is the width of the classroom?");
		double roomWidth = scnr.nextDouble();
		
		double roomFinalArea = roomLength * roomWidth;
		double roomFinalPerimeter = (roomLength + roomWidth) * 2;
		
		System.out.println("The perimeter of the room is " + roomFinalPerimeter);
		System.out.println("The area of the room is " + roomFinalArea);
		
		volumeCalc(roomLength, roomWidth);
		continueAgain();
		
	}
	
	static void continueAgain(){
		System.out.println("Would you like to measure another room?");
		char userAnswer = scnr.next().charAt(0);
		
		while (userAnswer == 'y' || userAnswer == 'Y') {
			scnr.nextLine(); // Scanner Garbage Collection.
			System.out.println("Sure, what is the length of the classroom?");
			double roomLengthTwo = scnr.nextDouble();
			System.out.println("What is the width of the classroom?");
			double roomWidthTwo = scnr.nextDouble();
			
			double roomAreaTwoFinal = roomLengthTwo * roomWidthTwo;
			double roomPerimeterTwoFinal = (roomLengthTwo + roomWidthTwo) * 2;
			
			System.out.println("The perimiter of the room is " + roomPerimeterTwoFinal);
			System.out.println("The area of the room is " + roomAreaTwoFinal);
			
			volumeCalc(roomLengthTwo, roomWidthTwo);
			
			System.out.println("Would you still like to measure classrooms?");
			scnr.nextLine(); // Scanner Garbage Collection.
			userAnswer = scnr.next().charAt(0);
			
				if (userAnswer != 'y' || userAnswer != 'Y') {
				System.out.println("Ending application");
				System.exit(6);
			}
			
			
			else {
				System.out.println("Close or restart program");
				System.exit(6);
			}
		}
	}
	
	static void volumeCalc(double length, double width) {
		System.out.println("Would you like to calculate the volume of this room?");
		char userAnswer = scnr.next().charAt(0);
		if (userAnswer == 'y') {
			scnr.nextLine(); // Scanner Garbage Collection.
			System.out.println("Okay, what is the height?");
			
			double height = scnr.nextDouble();
			double roomFinalArea = length * width * height;
			
			System.out.println("The area of the room is " + roomFinalArea);
			
			continueAgain();
			
		}
		
		else {
			continueAgain();
		}
	}
}