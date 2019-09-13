// Program to demonstrate toBigInteger() method of BigDecimal 

import java.math.*; 

public class GFG { 

	public static void main(String[] args) 
	{ 

		// Assigning the BigDecimal b 
		BigDecimal b = new BigDecimal("123.6"); 

		// Assigning the BigInteger value of BigDecimal b to BigInteger i 
		BigInteger i = b.toBigInteger(); 

		// Print i value 
		System.out.println("BigInteger value of " + b + " is " + i); 
	} 
} 
Input : double a=0.03;
        double b=0.04;
        double c=b-a;
        System.out.println(c);
Output :0.009999999999999998

Input : BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.04");
        BigDecimal _c = _b.subtract(_a);
        System.out.println(_c);
Output :0.01
