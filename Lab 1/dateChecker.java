import java.util.Scanner;
public class dateChecker {

	public static void main (String [] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		//Collecting date values from user input
		System.out.println("Please enter a month number...");
			int monthVal = scnr.nextInt();
			if (monthVal > 12 || monthVal <=0) {
				System.out.println("Error, for the month the value must be between 1 and 12.");
				System.exit(6);
			}
		
		System.out.println("Please enter a date...");
			int dateVal = scnr.nextInt();
			if (dateVal > 31 || dateVal <= 0) {
				System.out.println("Error, for the date the value must be between 1 and 31.");
				System.exit(6);
			}
		
		System.out.println("Please enter a year...");
			int yearVal = scnr.nextInt();
			if (yearVal > 9999 || yearVal < 0) {
				System.out.println("Error, for the year value must be between 0 and 9999.");
				System.exit(6);
			}
			
			System.out.println("Please enter another month number...");
			int monthVal2 = scnr.nextInt();
			if (monthVal2 > 12 || monthVal2 <=0) {
				System.out.println("Error, for the month the value must be between 1 and 12.");
				System.exit(6);
			}
		
		System.out.println("Please enter another date...");
			int dateVal2 = scnr.nextInt();
			if (dateVal2 > 31 || dateVal2 <= 0) {
				System.out.println("Error, for the date the value must be between 1 and 31.");
				System.exit(6);
			}
		
		System.out.println("Please another enter year...");
			int yearVal2 = scnr.nextInt();
			if (yearVal2 > 9999 || yearVal2 < 0) {
				System.out.println("Error, for the year value must be between 0 and 9999.");
				System.exit(6);
			}
		scnr.close();
		
		//Calculating difference in collected dates from user and final outputs. 
		int monthValA = (monthVal - monthVal2);
			if (monthValA <= 0) {
				monthValA = monthValA * -1;
			}
		int dateValA = (dateVal - dateVal2) * -1;
			if (dateValA <= 0) {
				dateValA = dateValA * -1;
			}
		int yearValA = (yearVal - yearVal2) * -1;
			if (yearValA <= 0) {
				yearValA = yearValA * -1;
			}
		
		/* calculation output check
		System.out.println(monthVal + " " + dateVal + " "  + yearVal);
		System.out.println(monthVal2 + " " + dateVal2 + " " + yearVal2);
		*/
			
		System.out.println("The duration between months is: " + monthValA + " months " + dateValA + " days " + yearValA + " years.");
		System.out.println("Restart");
		
		System.exit(6);
	}
}