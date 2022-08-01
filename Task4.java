package Task4;

import java.util.Scanner;

public class Task4 {
	static boolean isPerfectSquare(int x)
    {
       int s = (int) Math.sqrt(x); 
       return (s*s == x);
     }
  
   static boolean isFibonacci(int x)
      {
         return isPerfectSquare(5*x*x + 4) ||
           isPerfectSquare(5*x*x - 4);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	      System.out.print("Input a number: ");
	      int n = scan.nextInt();	       
		  if (n>0)
			{	
			 System.out.println("Is Fibonacci number? "+isFibonacci(n)); 
			}         
	}

}
