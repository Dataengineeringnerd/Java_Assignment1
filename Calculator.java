//Import Packages here
import java.util.Scanner;
import java.io.*;
import java.util.Random;

class Calculator {
	public static void main(String[] args) {

    	int option;  //use this variable in switch case
    	double number1, number2, result=0.0;
    	Scanner myObj = new Scanner(System.in); 
    	Random random = new Random();
    	
	// Handle exception whereever needed
    	try {
		// ask users to enter option
	    	System.out.print("1. Addition. \n 2. Substraction \n 3. Multiplication \n "
	    			+ "4. Division \n 5. Maximum \n 6. Minimum. \n 7. Random \n");
	    	System.out.println("Enter One of the Options: ");
			option = myObj.nextInt();
	
		// ask user to enter first number
	    	System.out.println("Enter First Number");
	    	number1 = myObj.nextDouble();
		// ask user to enter second number
	    	System.out.println("Enter Second Number");
	    	number2 =  myObj.nextDouble();
	    	
		// use switch case to implement    	
	      	switch(option) {		
	// perform addition between the numbers if user enters option 1.
	      	case 1:
	      		result= number1 + number2;
	      		System.out.println("Addition: " + number1 +  " + " + number2+ " = " + result);
	      		break;
	// perform subtraction between the numbers if user enters 2.
	     	case 2:
	      		result= number1 - number2;
	      		System.out.println("Subtraction: " + number1 +  " - " + number2+ " = " + result);
	      		break;
	// perform multiplication between the numbers if option 3.
	     	case 3:
	      		result= number1 * number2;
	      		System.out.println("Multiplication: " + number1 +  " * " + number2+ " = " + result);	
	      		break;
	// perform division between the numbers if user enters option 4.
	     	case 4:
	      		result= number1 / number2;
	      		System.out.println("Division: " + number1 +  " / " + number2+ " = " + result);
	      		break;
	// compute maximum between the numbers if user enters option 5.
	     	case 5:
	      		result= Math.max(number1, number2);
	      		System.out.println("The Maximum Number is : " + result);
	      		break;
	// compute minimum between the numbers if user enters option 6.
	     	case 6:
	      		result= Math.min(number1, number2);
	      		System.out.println("The Minimum Number is : " + result);
	      		break;
	// generate random number between the numbers if enters option 7.
	     	case 7:
	      		result= Math.min(number1, number2) + (Math.random()* Math.max(number1, number2));;
	      		System.out.println("Random Number between " + number1 + " and "+ number2 + " is: " + result);
	      	default:
	      		System.out.println("Pick an option between 1 and 7");
	      	}
// use default case to handle invalid option (when user choose different option other than given).
    	} catch (Exception e) {
            System.out.println("Error: Value Must be an integer");
        }
    	}
      }


