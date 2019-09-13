// Java program to find large factorials using BigInteger 
import java.math.BigInteger; 
import java.util.Scanner; 

public class Example 
{ 
	// Returns Factorial of N 
	static BigInteger factorial(int N) 
	{ 
		// Initialize result 
		BigInteger f = new BigInteger("1"); // Or BigInteger.ONE 

		// Multiply f with 2, 3, ...N 
		for (int i = 2; i <= N; i++) 
			f = f.multiply(BigInteger.valueOf(i)); 

		return f; 
	} 

	// Driver method 
	public static void main(String args[]) throws Exception 
	{ 
		int N = 20; 
		System.out.println(factorial(N)); 
	} 
} 

////////////////////
// Java program to demonstrate 
// subtract() method of BigInteger 

import java.math.BigInteger; 

public class GFG { 
	public static void main(String[] args) 
	{ 
		// BigInteger object to store result 
		BigInteger diff; 

		// For user input 
		// Use Scanner or BufferedReader 

		// Two objects of String created 
		// Holds the values to calculate the difference 
		String input1 
			= "56454210032311316797946498748"; 
		String input2 
			= "34664864678464621214565587864"; 

		// Convert the string input to BigInteger 
		BigInteger a 
			= new BigInteger(input1); 
		BigInteger b 
			= new BigInteger(input2); 

		// Using subtract() method 
		diff = a.subtract(b); 

		// Display the result in BigInteger 
		System.out.println("The difference of\n"
						+ a + " \nand\n" + b + " "
						+ "\nis\n" + diff); 
	} 
} 


/////////////////////////////////
Input: BigInteger1=2345, BigInteger2=7456
Output: -1
Explanation: BigInteger1.compareTo(BigInteger2)=-1.

Input: BigInteger1=9834, BigInteger2=7456
Output: 1
Explanation: BigInteger1.compareTo(BigInteger2)=1.
Example 1: Below programs illustrate compareTo() method of BigInteger class when both BigIntegers are equal

filter_none
edit
play_arrow

brightness_4
// Java program to demonstrate  
// compareTo() method of BigInteger 
  
import java.math.BigInteger; 
  
public class GFG { 
  
    public static void main(String[] args) 
    { 
        // Creating 2 BigInteger objects 
        BigInteger b1, b2; 
  
        b1 = new BigInteger("321456"); 
        b2 = new BigInteger("321456"); 
  
        // apply compareTo() method 
        int comparevalue = b1.compareTo(b2); 
  
        // print result 
        if (comparevalue == 0) { 
  
            System.out.println("BigInteger1 "
                               + b1 + " and BigInteger2 "
                               + b2 + " are equal"); 
        } 
        else if (comparevalue == 1) { 
  
            System.out.println("BigInteger1 " + b1 + "  
                is greater than BigInteger2 " + b2); 
        } 
        else { 
  
            System.out.println("BigInteger1 " + b1 + "  
                is lesser than BigInteger2 " + b2); 
        } 
    } 
} 
Output:
BigInteger1 321456 and BigInteger2 321456 are equal
////////////////////////
// Java program to demonstrate 
// divide() method of BigInteger 

import java.math.BigInteger; 

public class GFG { 
	public static void main(String[] args) 
	{ 
		// BigInteger object to store result 
		BigInteger div; 

		// Two objects of String created 
		// Holds the values to calculate the division 
		String input1 = "400000000000000000"
						+ "000000000000000000"; 

		String input2 = "8000000"; 

		// Convert the string input to BigInteger 
		BigInteger a 
			= new BigInteger(input1); 
		BigInteger b 
			= new BigInteger(input2); 

		// Using divide() method 
		div = a.divide(b); 

		// Display the result in BigInteger 
		System.out.println("The division of\n"
						+ a + " \nby\n" + b + " "
						+ "\nis\n" + div); 
	} 
} 
///////////////////////////////////
