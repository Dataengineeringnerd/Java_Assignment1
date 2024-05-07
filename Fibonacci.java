//Import Packages here
import java.util.Scanner;
import java.io.*;

class Fibonacci {
  
    // fib(int n) method here
	 // Function to print the Fibonacci series
    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;
 
        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }
 
    // main method
    public static void main(String args[])
    {
    	
       boolean yes=true; // for implementing infinite loop
	   int flag=0;		// for breaking infinite loop
	   Scanner myObj = new Scanner(System.in);  
		//Handle exceptions
		 
	   try {
			// Ask the user to Enter the number (value of n)
		   while (yes) {
			   System.out.println("Enter a Number: ");
			   int num = myObj.nextInt();
			   // Call fib(n) to generate and print Fibonacci Series for
			   System.out.print("Fibonacci Series for the " +num + " numbers:");
			   for(int i=0; i < num; i++) {
				   System.out.print(fib(i) + " ");
			   }
			// Ask the user to Type 1 to continue. 
			   System.out.println("Type 1 to continue and any character to exit: ");
			   int inoutnum = Integer.parseInt(myObj.nextLine());
			   if (inoutnum !=1) {
				   break;
			   }
			   
	   }}
	   
	   catch(Exception e) {
		   System.out.println("Error: Value Must be an integer");
	   }
	   }
}

