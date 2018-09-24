import java.util.Scanner;
public class numChecker {
	
	
	public static void main (String [] args) {
		
		System.out.println("Will each corresponding place in two numbers sum the same total? ");
		valueCalc();
	}
	
	public static numChecker valueCalc() {
		
		int inputNumber1;
		int inputNumber2;
		Scanner scnr = new Scanner(System.in);
		
		//Collecting user input to begin number comparison. 
		System.out.println("Please enter your first value...");
		
		inputNumber1 = scnr.nextInt();
		if (inputNumber1 > 99) {
			System.out.println("Please enter enter your second...");
		}
		else{
			System.out.println("Value entered too small, must be at least 100...");
			System.out.print("Restart App");
			System.exit(6);
		}
	
		inputNumber2 = scnr.nextInt();
		if (inputNumber2 <= 99) {
			System.out.println("Value entered too small, must be at least 100...");
			System.out.print("Restart App");
			System.exit(6);
		}
		
		scnr.close();
		
		//Converting input value back to int and storing each decimal places value into a variable
		int finalValA1 = Integer.parseInt(String.valueOf(inputNumber1).substring(0, 1));
		int finalValA2 = Integer.parseInt(String.valueOf(inputNumber1).substring(1, 2));
		int finalValA3 = Integer.parseInt(String.valueOf(inputNumber1).substring(2));
		int finalValB1 = Integer.parseInt(String.valueOf(inputNumber2).substring(0, 1));
		int finalValB2 = Integer.parseInt(String.valueOf(inputNumber2).substring(1, 2));
		int finalValB3 = Integer.parseInt(String.valueOf(inputNumber2).substring(2));
		
		/* String to int conversion check
		System.out.print(finalValA1);
		System.out.print(finalValA2);
		System.out.println(finalValA3);
		
		System.out.print(finalValB1);
		System.out.print(finalValB2);
		System.out.print(finalValB3);
		*/
		
		int checkNumA = finalValA1 + finalValB1;
		int checkNumB = finalValA2 + finalValB2;
	    int checkNumC = finalValA3 + finalValB3;
		
		//check for matching decimal place sums and final outputs
	    if ((checkNumA == checkNumB) && (checkNumB == checkNumC)) {
	    	
	    	System.out.println("True!");
	    	System.out.println("Restart");
	    	System.exit(6);
	    }
	    
	    else {
	    	System.out.println("False.");
	    	System.exit(6);
	    }
	    
		return null;
	}
		
}
	
	
	
	
	
	
	
	

